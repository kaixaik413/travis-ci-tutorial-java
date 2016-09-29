package io.github.joaomlneto.travis_ci_tutorial_java;

public class Driver {

	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		int x = 10;
		
		x = calc.mul(x, 3);
		x = calc.mul(x, 7);
		x = calc.mul(x, 13);
		x = calc.mul(x, 37);
		
		System.out.println("The result is: " + x);
	}

}
