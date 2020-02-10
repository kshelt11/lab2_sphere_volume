import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {

		/*
		 * Print the purpose of the program 
		 * Print a prompt asking for the diameter of a sphere 
		 * Read the diameter 
		 * Calculate the radius as diameter divided by 2
		 * Calculate volume of the sphere using the formula (see Task #3b)
		 */
		
		System.out.println("This program calculates the radius and volume of a sphere given its diameter.");
		
		System.out.print("Input the diameter: ");
		
		Scanner stdin = new Scanner(System.in);
		double diameter = stdin.nextDouble();
		double radius = diameter/2.0;
		
		System.out.println("The radius of the sphere is: "+radius+" units");
		
		double volume = Math.pow(radius,3) * (double)4/3 * Math.PI;
		
		System.out.println("The volume of the sphere is: "+volume+" units^3");

		stdin.close();
	}
}
