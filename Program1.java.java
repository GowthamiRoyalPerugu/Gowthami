package problems;

import java.util.Scanner;

public class Calculator {
	
	public double add(double a,double b)
	{
		return a+b;
	}
	public double subtract(double a,double b)
	{
		return a-b;
	}
	public double multiply(double a,double b)
	{
		return a*b;
	}
	public double divide(double a,double b)
	{
		if(b==0)
		{
			System.out.println("runtime error");
		}
		return a/b;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		String operation =scanner.next();
		double result=0.0;
		Calculator calculator = new Calculator();
		switch(operation)
		{
		case "add":
			result=calculator.add(a, b);
		break;
		case "sub":
			result=calculator.subtract(a, b);
		break;
		case "mul":
			result=calculator.multiply(a, b);
		break;
		case "div":
			result=calculator.divide(a, b);
		break;
		default:
			System.out.println("undefined operator");
		}
		System.out.println("result of "+operation+" operation is:"+result);
		scanner.close();
	}
}
