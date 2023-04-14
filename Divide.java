public class Divide extends Binop{

	public Divide(Node l, Node r) {
		super(l, r);
	}
	public Divide() {
		
	}
	public String toString() {
		return "(" + lChild.toString() + " / " + rChild.toString() + ")";
	}

	@Override
	public double eval(double[] values) {
		return lChild.eval(values) / rChild.eval(values);
	}

}
