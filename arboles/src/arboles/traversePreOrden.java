package arboles;

public class traversePreOrden{

	public void traversePreOrder(Node node) {
	    if (node != null) {
	        System.out.print("PreOrden es " + node.value);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	
	}

}
