package alu;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		// Operation add = (a, b) -> a + b;// new Add();
		// Operation sub = (a, b) -> a - b;// new Subtract();
		// Operation mul = (a, b) -> a * b;// new Multiply();
		// Operation div = (a, b) -> {
		// if (b == 0) {
		// throw new IllegalArgumentException("Division by 0");
		// }
		// return a / b;
		// }; // new Divide();
		Operation adder = new Add();
		BinaryOperator<Double> add = adder::calc;
		BinaryOperator<Double> sub = (a, b) -> a - b;// new Subtract();
		BinaryOperator<Double> mul = (a, b) -> a * b;// new Multiply();
		BinaryOperator<Double> div = (a, b) -> {
			if (b == 0) {
				throw new IllegalArgumentException("Division by 0");
			}
			return a / b;
		}; // new Divide();

		calc.print(add, 2D, 3D);
		calc.print(sub, 2D, 3D);
		calc.print(mul, 2D, 3D);
		calc.print(div, 2D, 1D);

		Consumer<BinaryOperator<Double>> printer = p-> System.out.println(p.apply(20D, 10D));
		printer.accept(add);
	}

	public void print(BinaryOperator<Double> op, Double a, Double b) {
		System.out.println(op.apply(a, b));
	}
}
