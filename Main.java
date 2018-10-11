import java.util.Scanner;

	//Dianna Theurer
public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to my project!");
		int a = (3);
		int b = (4);
		System.out.println(a + b);
	
		final int z = 100;
	//is a parameter that can only be assigned once
		System.out.println(z);
	
		String cat = "fluffy";
		System.out.println(cat);
	
		double num1 = 2.5;
		double num2 = 7.5;
		System.out.println(num1/num2);
	
		if (a <= 3)
		System.out.println("I'm equal to 3!");
		if (a + b >= 7)
		System.out.println("Yay I equal 7!");
		if (num1 + num2 >= 10)
		System.out.println("I equal 10... ugh");
	//boolean expression
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
	  
	  public static double calculateArea(double side, double side2) {
	    double area;
	    area = side * side2;
	    return area;
	  }
	  public static double calculateVolume(double side1, double side2, double side3) {
		  double volume;
		  volume = side1 * side2 * side3;
		  return volume;
	  // method call with return values
	  }
	  
}