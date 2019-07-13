/**
 * 
 */
package LinkedList;

import java.util.Objects;

/**
 * @author Atul
 *
 */
public class SinglyLinkedList {
	private Node start = null;

	public SinglyLinkedList() {
		// nothing to do
	}

	//public SinglyLinkedList(Node head) {
		//this.start = head;
	//}

	public void add(int i) {
		Node node = new Node(i);
		node.next = this.start;
		this.start = node;
	}

	public void append(int i) {
		Node node = new Node(i);
		if (Objects.isNull(this.start)) {
			this.start = node;
			return;
		}
		Node curr = this.start;
		while (Objects.nonNull(curr.next)) {
			curr = curr.next;
		}
		//curr.next = node;
		node.next = curr.next;
		curr.next = node;
	}

	public void display() {
		Node curr = this.start;
		while (Objects.nonNull(curr)) {
			System.out.print(curr.data);
			if (Objects.nonNull(curr.next)) {
				System.out.print("->");
			}
			curr = curr.next;
		}
		System.out.println();
	}
public void search(int i)
{
	Node curr = start;
	int flag = 0;
	int count = 0;
	while(curr!=null)
	{
		count++;
		if(curr.data == i)
		{
			flag=1;
			System.out.println(i + " found at location " + count);
		}
		curr = curr.next;
	}
	if(flag==0)
	{
		System.out.println(i + " not found");
	}
}
public void sort()
{
	Node p,q;
	int temp;
	p = start;
	
	for(p = start; p.next!=null; p = p.next)
	{
		for(q = p.next; q!=null; q = q.next)
		{
			if(p.data > q.data)
			{
				temp = p.data;
				p.data = q.data;
				q.data = temp;
			}
		}
	}
	
}
	public void delete(int i) {
		if (Objects.isNull(this.start)) {
			System.out.println("No elements to remove!");
		}
		if (this.start.data == i) {
			Node curr = this.start;
			this.start = curr.next;
			System.out.println(curr + " Successfully deleted.");
			curr = null;
		} else {
			Node curr = this.start;
			Node prev = null;
			while (Objects.nonNull(curr) && curr.data != i) {
				prev = curr;
				curr = curr.next;
			}
			if (Objects.nonNull(curr)) {
				prev.next = curr.next;
				System.out.println(curr + " Successfully deleted.");
				curr.next = null;
				curr = null;
			} else {
				System.out.println(i + " not found!");
			}
		}
	}

}