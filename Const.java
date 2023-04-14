import java.text.DecimalFormat;
import java.util.Random;

public class Const extends Node {
    /** the constant value 
     * This class will pick a random number between 1-20 for the program
     */
    private double value;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    /**
     * @param d the value to set the constant to.
     */
    public Const(double d) {
        value=d;
    }
    /**
     * @return the value of the constant.
     */
    public String toString() {
        //String.format(".2f", value);
        String output ="" + df.format(value);
        return output;
    }
    @Override
    public double eval(double[] values) {
        return value;
    }
    public void addRandomKids(OperatorFactory o,
            TerminalFactory t, int maxDepth, Random rand) {}
}
