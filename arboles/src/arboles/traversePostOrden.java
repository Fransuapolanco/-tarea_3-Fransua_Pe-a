package arboles;

public class traversePostOrden{

	public void traversePostOrder(Node node) {
	    if (node != null) {
	        traversePostOrder(node.left);
	        traversePostOrder(node.right);
	        System.out.print("Post Orden es " + node.value);
	    }
	}

}
