/**
 * 
 */
package LinkedList;

/**
 * @author Atul
 *
 */
public class Demo {
	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		//singlyLinkedList.append(2);
		singlyLinkedList.append(45);
		singlyLinkedList.append(8);
		singlyLinkedList.append(34);
		singlyLinkedList.append(46);
		singlyLinkedList.add(1);
		singlyLinkedList.add(2);
		singlyLinkedList.display();

		singlyLinkedList.delete(34);
		singlyLinkedList.delete(1);

		singlyLinkedList.display();
		singlyLinkedList.search(46);
		singlyLinkedList.sort();
		singlyLinkedList.display();
		System.out.println("----------------------------------------------------");
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.append(65);
		doublyLinkedList.append(5);
		doublyLinkedList.append(8);
		doublyLinkedList.append(34);
		doublyLinkedList.append(46);
		doublyLinkedList.add(1);

		doublyLinkedList.display();
		
		doublyLinkedList.delete(1);
		
		doublyLinkedList.display();
	}
}
