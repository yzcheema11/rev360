#Exercise 1 - Converting Refractions
In optometry and ophthalmology, refractions with astigmatism are written in either plus-cylinder or minus-cylinder notation.

Optometrists tend to use minus-cylinder notation, while ophthalmologists tend to use plus-cylinder notation. It's useful for doctors and staff to be able to convert between the two notations. The math is easy enough to do in your head, but having an automated way avoids errors.

Here are the components of a refraction for an astigmatic eye:

* Sphere power - units are diopters, normally expressed in 0.25 increments with two digits after the decimal point. Range between about -25.00 and +25.00

* Cylinder power - units are diopters, also normally expressed in 0.25 increments. This will be a negative value in minus-cylinder notation, or a positive value in plus-cylinder notation. Range generally between 0.00 and +/-15.00.

* Axis - units are degrees, normally expressed in 1 degree increments. Written as 3 digits with leading zeros, to avoid confusion when reading a prescription. Range between 001 and 180. Axis less than 001 or greater than 180 is equivalent to adding or subtracting 180 degrees. e.g. axis 197 == 017, and axis -030 == 150

* Axis and Cylinder are a pair - you can't have a Cylinder measurement without an Axis, and you can't have an Axis measurement without a Cylinder power.

A refraction for an astigmatic eye is written: Sphere Cylinder xAxis

###Examples:
+0.50 -3.25 x070

-3.75 +2.00 x154

###Conversion:
To convert from minus-cylinder notation to plus-cylinder notation or from plus-cylinder to minus-cylinder, add the Cylinder power to the Sphere power, negate the Cylinder power, and rotate the Axis by 90 degrees (add or subtract 90 degrees to the Axis).

###Example:
+1.50 -1.25 x080 - the Cylinder power is negative, so this is a minus-cylinder refraction. The equivalent refraction in plus-cylinder notation would be +0.25 +1.25 x170.

###Your task:
Write a program that can convert between a plus-cylinder refraction and minus-cylinder refraction, or convert minus-cylinder to plus-cylinder.  This program should be able to take Sphere, Cylinder, and Axis values as input and display a converted Refraction as output.  It's up to you how you implement that.  A command-line program is acceptable.  Keep in mind that this conversion logic should be able to be reused by other applications in the future.
