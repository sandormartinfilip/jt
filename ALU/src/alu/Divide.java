package alu;

public class Divide implements Operation {

	@Override
	public double calc(Double a, Double b) {
		if(b==0){
			throw new IllegalArgumentException();
		}
		return a / b;
	}

}
