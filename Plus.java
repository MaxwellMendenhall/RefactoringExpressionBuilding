public class Plus extends Binop {
    /**
     * @param l the left node
     * @param r the right node
     */
   public Plus(Node l, Node r) {
       super(l, r);
   }
   public Plus() {
	   
   }
   /**
    * @return the result of adding
    * lChild to rChild after each has
    * been evaluated.x
    */
   public String toString() {
	   String output = "(" + lChild.toString() + " + " + rChild.toString() + ")";
	   return output;
   }
@Override
public double eval(double[] values) {
	return lChild.eval(values) + rChild.eval(values);
}
}
