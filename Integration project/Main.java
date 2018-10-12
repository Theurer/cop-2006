import java.util.Scanner;

	//Dianna Theurer
public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to my project!");
	// Java Data Types
	//byte: 8 bit
	//short: 16 bit
	//int: 32 bit
	//long: 64 bit two's complement
	//float: 32 bit floating point
	//double: 64 bit floating point
	//boolean: true or false
	//char: 16 bit single character
		int a = (3);
		int b = (4);
		System.out.println(a + b);
		int x = 100;
		int y = x;
		y++;
		System.out.println("Value of x is " + x);
		System.out.println("Value of y is " + y);
	
		final int z = 100;
	// final is a parameter that can only be assigned once
		System.out.println(z);
	
		String cat = "fluffy";
		System.out.println(cat);
		System.out.println(Math.PI);
	// Math class. Preset functins in Java	
		double num1 = 2.5;
		double num2 = 7.5;
		System.out.println(num1/num2);
		
		int num3 = (int)num1;
		System.out.println(num3);
	// Casting is changing the data type of a variable to another
	// when casting, variable must be compatible
	
		if (a <= 3)
		System.out.println("I'm equal to 3!");
		if (a + b >= 7)
		System.out.println("Yay I equal 7!");
		if (num1 + num2 >= 10)
		System.out.println("I equal 10... ugh");
	//if statement
	}
	public static int getSum(Scanner console) {
		System.out.println("Type 2 numbers: ");
		int num1 = console.nextInt();
		int num2= console.nextInt();
		int sum = calculateSum(num1, num2);
		System.out.println("num1 is" + num1);
		return sum;
	}
	public static int calculateSum(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		num1 = 10;
		num2 = 8;
		return sum;
	// what does this do?
	  }
	public static double Area; {
	    double length = 5.0;
	    double width = 2.5;
	    double height = 3.0;
	    double area = calculateArea(length, width);
	    double volume = calculateVolume(length, width, height);
	    System.out.println(area);
	    System.out.println(volume);
	  }
	 // header is the first line of each method. tells the program what value type and return type.
	 // The type of data recieved from a method
	  public static double calculateArea(double side, double side2) {
	    double area;
	    area = side * side2;
	    return area;
	  }
	  public static double calculateVolume(double side1, double side2, double side3) {
		  double volume;
		  volume = side1 * side2 * side3;
		  return volume;
	 // method call with return 
	  }
	 // operator precedence is just the order of operations used in math PEMDAS.
	 // describes in what order math functions will be solved.
	  public class Random {
		  Random randomGen = new Random();
		  int value = randomGen.nextInt(50);
	 // random class
	  }
	  
}