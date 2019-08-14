import java.text.DecimalFormat;
import java.util.Scanner;

public class AstigmatismRefractions {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat axisFormat = new DecimalFormat("000");
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    private double cylinderPower;
    private double spherePower;
    private int axisPower;

    public void captureSphere() {
        do{
            System.out.println("Enter a valid Sphere Power between -25.00 and 25.00 that is incremented by .25:");
            spherePower = scanner.nextDouble();
        }
        while(Math.abs(spherePower) >= 25 || !isPowerDivisibleByQuarter(spherePower));
    }

    public void captureCylinder() {
        do {
            System.out.println("Enter a valid Cylinder Power between -15.00 and 15.00 that is incremented by .25:");
            cylinderPower = scanner.nextDouble();
        }
        while (Math.abs(cylinderPower) >= 15 || !isPowerDivisibleByQuarter(cylinderPower)) ;

    }

    public void captureAxis() {
        System.out.println("Enter a valid Axis Power between -179 and 359");
        axisPower = scanner.nextInt();

        if (axisPower < 0){
            axisPower += 180;
        }
        else if (axisPower > 180){
            axisPower -= 180;
        }
    }

    public boolean isPowerDivisibleByQuarter(Double power) {
        return power/.25 != 0;
    }

    public void convertRefractions() {

        String output;
        int newAxis;

        output = ("You have entered: " + decimalFormat.format(spherePower) + " " + decimalFormat.format(cylinderPower) + " x " + axisFormat.format(axisPower));
        System.out.println(output);

        spherePower = cylinderPower + spherePower;
        cylinderPower = cylinderPower * -1;
        axisPower += 90;
        newAxis = axisPower > 180? axisPower - 180 : axisPower;

        output = ("Your converted refraction is: " + (spherePower < 0? " " : "+") + decimalFormat.format(spherePower) + (cylinderPower < 0? " " : " +") + decimalFormat.format(cylinderPower) + " x " + axisFormat.format(newAxis));
        System.out.println(output);
    }

    public static void main(String[] args) {
        AstigmatismRefractions astigmatismRefractions = new AstigmatismRefractions();

        astigmatismRefractions.captureSphere();
        astigmatismRefractions.captureCylinder();
        astigmatismRefractions.captureAxis();
        astigmatismRefractions.convertRefractions();
    }
}
