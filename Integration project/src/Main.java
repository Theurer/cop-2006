import java.util.Scanner;

//Dianna Theurer
public class Main {
// Java Data Types
	//byte: 8 bit
	//short: 16 bit
	//int: 32 bit
	//long: 64 bit two's complement
	//float: 32 bit floating point
	//double: 64 bit floating point
	//boolean: true or false
	//char: 16 bit single character
	public static void main(String[] args) {
		System.out.println("Welcome to my project!");
	int a = (3);
	int b = (4);
	System.out.println(a + b);
	
	
	double num1 = 2.5;
	double num2 = 7.5;
	System.out.println(num1/num2);
	
	if (a <= 3)
		System.out.println("I'm equal to 3!");
	if (a + b >= 7)
		System.out.println("Yay I equal 7!");
	if (num1 + num2 >= 10)
		System.out.println("I equal 10... ugh");
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
		return sum;
	
	} //what does this do?
		
}
