import java.util.Random;

public class Variable extends Node{
	/*
	 * This class will choose the variable to be used ex. X0, X1, or X2
	 * It will take in a number when the class is called
	 * that number will be the number on the index for example
	 * if 1 is passed into the class it should find [1] on the array
	 * 
	 * The array will be filled with the eval() with an array variable 
	 * being passed into it
	 */
	
	private int index;
	
	//static double[] x = {10.1,0.6,0.3};
	
	public Variable(double i) {
        index = (int) i;
    }

	@Override
	public double eval(double[] values) {
		//System.out.println(values[index]);
		return values[index];
	}
	public String toString() {
		if(index == 0) {
			return "X0";
		}
		if(index == 1) {
			return "X1";
		}
		if(index == 2) {
			return "X2";
		}
    	return null;
    }
	public void addRandomKids(OperatorFactory o,
		    TerminalFactory t, int maxDepth, Random rand) {}
	

}
