import java.util.Random;

public class OperatorFactory {
    private Node[] currentOps;
    OperatorFactory(Node[] n) {
        this.currentOps = n;
    }
    public Node getOperator(Random rand) {
    	//chooses a random operator 
    	int randInt = rand.nextInt(4) + 1;
    	switch(randInt) {
    	case 1: return new Plus();
    	case 2: return new Divide();
    	case 3: return new Minus();
    	case 4: return new Mult();
    	}
    	return null;
    }
    public int getNumOps() {
    	int numOps = currentOps.length;
        return numOps;
    }
}
