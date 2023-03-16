package javaOperators;

public class ArthmeticOperator 
{

	public static void main(String[] args) 
	{
		int num1 = 4;
		int num2 = 2;
		int num3 = 3;
		int add = num1 + num2 + num3;
	    int sub = num1 - num2;
	    int multi = num1 * num2;
	    int div = num1 / num2;
	    int rem = num1 % num2;
		
		System.out.println("Addition of " + num1 +" and " + num2 +" and " + num3 +" is " + add);
		System.out.println("Subtraction of num1 and num2 is :" + sub);
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is :" + multi);
		System.out.println("Multiplication of " + num1 + " * " + num2 + " is :" + multi);
		System.out.println("Division of " + num1 + " and " + num2 + " is :" + div);
		System.out.println("Remainder of " + num1   + "," + num2 + " is :" + rem);
	}
	
	

}
