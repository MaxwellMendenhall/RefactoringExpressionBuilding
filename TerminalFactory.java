import java.util.Random;

public class TerminalFactory {
    private int numIndepVars;
    TerminalFactory(int n) {
        this.numIndepVars=n;
    }
    public Node getTerminal(Random rand) {
        int randTerm = rand.nextInt(numIndepVars+1);
        if(randTerm < numIndepVars) {
            return new Variable(randTerm);
        }else{
            double double_random = rand.nextDouble();
            return new Const(double_random);
        }
        // add
    }
    public int getNumIndepVars() {
        return numIndepVars;
    }
}
