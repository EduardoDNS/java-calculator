package entities;

public class Calculator {
	
	double op1;
	double op2;
	
	public Calculator(double operation1, double operation2) {
		this.op1 = operation1;
		this.op2 = operation2;
	}

	public double getOperation1() {
		return op1;
	}

	public void setOperation1(double operation1) {
		this.op1 = operation1;
	}

	public double getOperation2() {
		return op2;
	}

	public void setOperation2(double operation2) {
		this.op2 = operation2;
	}
	
	public double sum() {
		double result = op1 + op2;
		return result;
	}
	public double sub() {
		double result = op1 - op2;
		return result;
	}
	public double mult() {
		double result = op1 * op2;
		return result;
	}
	public double div() {
		double result = op1 / op2;
		return result;
	}
}
