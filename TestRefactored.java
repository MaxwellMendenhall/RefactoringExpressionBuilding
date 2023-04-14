import java.util.Random;

public class TestRefactored {
    static int numIndepVars = 3;
    static int maxDepth = 5;
    static Random rand = new Random();
    public static void main(String[] args) {
        double[] data = new double[3];
        data[0] = 3.14;
        data[1] = 2.78;
        data[2] = 1.0;
        Node[] ops = {new Plus(), new Minus(), new Mult(), new Divide()};
        OperatorFactory o = new OperatorFactory(ops);
        TerminalFactory t = new TerminalFactory(numIndepVars);
        Node root = o.getOperator(rand);
        root.addRandomKids(o, t, maxDepth, rand);
        String s = root.toString();
        double x = root.eval(data);
        String output = String.format("%.2f", x);
        System.out.println(s + " = " + output);
    }
}
