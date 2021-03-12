package arboles;

public class containsNodeRecursive {
	private boolean containsNodeRecursive(Node current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    return value < current.value
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}

}

