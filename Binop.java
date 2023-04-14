import java.util.Random;

public abstract class Binop extends Node{
    /** the left child node */
    protected Node lChild;
    /** the right child node */
    protected Node rChild;
    /**
     * @param l the left node
     * @param r the right node
     */
    public Binop(Node l, Node r) {
        lChild = l;
        rChild = r;
        depth=0;
    }
    public Binop() {
        depth=0;
        lChild=null;
        rChild=null;
        
    }
    public void addRandomKids(OperatorFactory o, 
               TerminalFactory t, int maxDepth, Random rand) 
               {
         if(depth==maxDepth){
             lChild =t.getTerminal(rand);
             rChild =t.getTerminal(rand);
             lChild.depth=depth+1;
             rChild.depth=depth+1;
         }
         else{
             int i=rand.nextInt(o.getNumOps()+t.getNumIndepVars()+1);
             if(i<o.getNumOps()){

                 lChild =o.getOperator(rand);
                 lChild.depth=depth+1;
                 lChild.addRandomKids(o, t, maxDepth, rand);
             }

             else{
                 lChild =t.getTerminal(rand);
                 lChild.depth=depth+1;

             }

             int j=rand.nextInt(o.getNumOps()+t.getNumIndepVars());
             if(j<o.getNumOps()){

                 rChild =o.getOperator(rand);
                 rChild.depth=depth+1;
                 rChild.addRandomKids(o, t, maxDepth, rand);
             }

             else{
                 rChild =t.getTerminal(rand);
                 rChild.depth=depth+1;

             }
         }
     }
    public Object clone() {
        Object o = null;
            o =  super.clone();
        Binop b = (Binop) o;
        if(lChild != null) {
                b.lChild = (Node) lChild.clone();
            }
            if(rChild != null) {
               b.rChild = (Node) rChild.clone();
            }
            return o;
     }
    
}
