package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double op1 = 0.0;
		double op2 = 0.0;
	
		char signal = '+';
		
		boolean repeat = true;
		while(repeat == true) {
			boolean checkNumber = true;
			while(checkNumber) {
				checkNumber = false;
				System.out.print("Entry number¹: ");
				try {
					op1 = Double.parseDouble(scan.nextLine());
				}catch(java.lang.NumberFormatException e) {
					System.out.println("Invalid enter!");
					checkNumber = true;
				}
			}
			
			checkNumber = true;
			while(checkNumber) {
				checkNumber = false;
				System.out.print("Entry number²: ");
				try {
					op2 = Double.parseDouble(scan.nextLine());
				}catch(java.lang.NumberFormatException e) {
					System.out.println("Invalid enter!");
					checkNumber = true;
				}
			}
			
			boolean checkLoop = true;
			while(checkLoop) {
				checkLoop = false;
				System.out.println("Choose a signal (+, -, *, /)");
				try {
					signal = scan.nextLine().charAt(0);
				}catch(java.lang.NumberFormatException e){
					System.out.println("Invalid entry!");
					checkLoop = true;
				}
				if(signal != '+' && signal != '-' && signal != '*' && signal != '/') {
					System.out.println("Invalid entry!");
					checkLoop = true;
				}
			}
			
			
			Calculator calc = new Calculator(op1, op2);
			switch(signal) {
				case '+': System.out.printf("%.2f%n", calc.sum()); break;
				case '-': System.out.printf("%.2f%n", calc.sum()); break;
				case '*': System.out.printf("%.2f%n", calc.sum()); break;
				case '/': System.out.printf("%.2f%n", calc.sum()); break;
			}
			
			checkLoop = true;
			while(checkLoop) {
				checkLoop = false;
				char loop = ' ';
				try {
					System.out.print("Continue?(y/n) ");
					loop = scan.nextLine().charAt(0);
					if(loop == 'n') {
						repeat = false;
					}
				}catch(java.lang.NumberFormatException e) {
					System.out.println("Invalid entry!");
					checkLoop = true;
				}
				if(loop != 'n' && loop != 'y') {
					System.out.println("Invalid entry!");
					checkLoop = true;
				}
			}
		}
		
		System.out.println("END OF PROGRAM");
		
		scan.close();
	}
}
