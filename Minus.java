public class Minus extends Binop{

	public Minus(Node l, Node r) {
		super(l, r);
	}
	public Minus() {
		
	}
	public String toString() {
		return "(" + lChild.toString() + " - " + rChild.toString() + ")";
	}

	@Override
	public double eval(double[] values) {
		return lChild.eval(values) - rChild.eval(values);
	}

}
