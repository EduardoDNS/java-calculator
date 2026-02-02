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
			while(checkNumber == true) {
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
			while(checkNumber == true) {
				checkNumber = false;
				System.out.print("Entry number²: ");
				try {
					op2 = Double.parseDouble(scan.nextLine());
				}catch(java.lang.NumberFormatException e) {
					System.out.println("Invalid enter!");
					checkNumber = true;
				}
			}
			
			boolean checkSignal = true;
			while(checkSignal == true) {
				checkSignal = false;
				System.out.println("Choose a signal (+, -, *, /)");
				try {
					signal = scan.nextLine().charAt(0);
				}catch(java.lang.NumberFormatException e){
					System.out.println("Invalid entry!");
					checkSignal = true;
				}
				if(signal != '+' && signal != '-' && signal != '*' && signal != '/') {
					System.out.println("Invalid entry!");
					checkSignal = true;
				}
			}
			
			if(signal == '+') {
				Calculator calc = new Calculator(op1, op2);
				System.out.printf("%.2f%n", calc.sum());
			}
			if(signal == '-') {
				Calculator calc = new Calculator(op1, op2);
				System.out.printf("%.2f%n", calc.sub());
			}
			if(signal == '*') {
				Calculator calc = new Calculator(op1, op2);
				System.out.printf("%.2f%n", calc.mult());
			}
			if(signal == '/') {
				Calculator calc = new Calculator(op1, op2);
				System.out.printf("%.2f%n", calc.div());
			}
			
			boolean checkLoop = true;
			while(checkLoop == true) {
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
					checkSignal = true;
				}
				if(loop != 'n' && loop != 'y') {
					System.out.println("Invalid entry!");
					checkSignal = true;
				}
			}
		}
		
		System.out.println("END OF PROGRAM");
		
		scan.close();
	}
}
