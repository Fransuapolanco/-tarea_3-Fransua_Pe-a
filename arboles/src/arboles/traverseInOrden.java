package arboles;

public class traverseInOrden{

public void traverseInOrder (Node node) {
	 if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print("Entrada de orden " + node.value);
	        traverseInOrder(node.right);
	    }
}

}
