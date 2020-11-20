import java.util.Scanner;
import java.lang.Math;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world, this is Humza!");

		//Lab 10:
		
		Scanner scnr = new Scanner(System.in);
	      double wallHeight;
	      double wallWidth;
	      double wallArea;
	      double paintNeeded;
	      double cans;
	      int cansInt;
	      
	      System.out.println("Enter wall height (feet):");
	      wallHeight = scnr.nextDouble();
	      
	      System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextDouble();
	      
	      wallArea = wallWidth*wallHeight;
	      System.out.println("Wall area: " + wallArea + " square feet");
	      
	      paintNeeded = wallArea/350;
	      System.out.println("Paint needed: " + paintNeeded + " gallons");
	      
	      cansInt = (int) Math.ceil(paintNeeded);
	      System.out.println("Cans needed: " + cansInt + " can(s)");
		
	}

}
