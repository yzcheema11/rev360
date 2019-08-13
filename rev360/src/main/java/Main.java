import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat axisFormat = new DecimalFormat("000");
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    double cylinderPower;
    double storedCylinder = 30.00;
    double spherePower;
    double storedSphere = 30.00;
    int axis;
    int storedAxis;





    public void captureRefractions() {
        while (storedSphere == 30.00) {
            System.out.println("Enter a valid Sphere Power between -25.00 and 25.00 that is incremented by .25:");
            spherePower = scanner.nextDouble();
            if (spherePower >= -25.00 && spherePower <= 25.00)
                if (decimalFormat.format(spherePower).endsWith(".00") || decimalFormat.format(spherePower).endsWith(".25") || decimalFormat.format(spherePower).endsWith(".50") || decimalFormat.format(spherePower).endsWith(".75")) {
                storedSphere = spherePower;
            }
        }
        while (storedCylinder == 30.00) {
            System.out.println("Enter a valid Cylinder Power between -15.00 and 15.00 that is incremented by .25:");
            cylinderPower = scanner.nextDouble();
            if (cylinderPower >= -15.00 && cylinderPower <= 15.00)
                if (decimalFormat.format(cylinderPower).endsWith(".00") || decimalFormat.format(cylinderPower).endsWith(".25") || decimalFormat.format(cylinderPower).endsWith(".50") || decimalFormat.format(cylinderPower).endsWith(".75")) {
                    storedCylinder = cylinderPower;
                }
        }
        while (storedAxis == 0) {
            System.out.println("Enter a valid Axis Power between 1 and 180");
            axis = scanner.nextInt();
            if (axis <= 0){
                storedAxis = axis + 180;
            }
            if (axis > 180){
                storedAxis = axis - 180;
            }
        }
        String output = ("You have entered: " + decimalFormat.format(storedSphere) + " " + decimalFormat.format(storedCylinder) + " x " + axisFormat.format(storedAxis));
        System.out.println(output);
        double newSphere = storedCylinder + spherePower;
        double newCylinder = storedCylinder * -1;
        storedAxis += 90;
        System.out.println(newSphere);
        System.out.println(newCylinder);
        System.out.println(storedAxis);
        int newAxis = storedAxis > 180? storedAxis - 180 : storedAxis;
//        if (storedAxis > 180) {
//            newAxis = storedAxis - 180;
//        }
        output = ("Your converted refraction is: " + decimalFormat.format(newSphere) + " " + decimalFormat.format(newCylinder) + " x " + axisFormat.format(newAxis));
        System.out.println(output);
    }

//    public void convertRefractions() {
//        System.out.println(newSphere);
//        System.out.println(newCylinder);
//    }



    public static void main(String[] args) {
        Main main = new Main();

        main.captureRefractions();
//        main.convertRefractions();
    }
}
