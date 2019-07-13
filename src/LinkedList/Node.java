package LinkedList;
/**
 * 
 */

/**
 * @author Atul
 *
 */
public class Node {
	public int data;
	public Node next = null;
	public Node prev = null;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	@Override
	public String toString() {
		return Integer.toString(data);
	}
}
