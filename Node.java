import java.util.Random;

public abstract class Node {
	
	protected int depth;
	
	public abstract double eval(double[] x);
	public abstract void addRandomKids(OperatorFactory o, 
			TerminalFactory t, int maxDepth, Random rand); 
	public Object clone() {
		Object o = null;
	        try {
	            o =  super.clone();
	        }
	        catch(CloneNotSupportedException e) {
	            System.out.println("Node can't clone.");
	        }
	        return o;
	}
	
}
