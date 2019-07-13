package LinkedList;

import java.util.Objects;

public class DoublyLinkedList extends SinglyLinkedList {
	private Node start = null;

	@Override
	public void add(int i) {
		Node node = new Node(i);
		node.next = this.start;
		if (Objects.isNull(this.start)) {
			this.start = node;
			return;
		}
		this.start.prev = node;
		this.start = node;
	}

	@Override
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
		curr.next = node;
		node.prev = curr;
	}

	@Override
	public void display() {
		Node curr = this.start;
		while (Objects.nonNull(curr)) {
			System.out.print(curr.data);
			if (Objects.nonNull(curr.next)) {
				System.out.print("<->");
			}
			curr = curr.next;
		}
		System.out.println();
	}

	@Override
	public void delete(int i) {
		
		Node tmp = null;
		
		if(start == null)
		{
			System.out.println("List is empty");
		}
		
		//Deletion of only node
		
		if(start.next == null)
		{
			if(start.data == i)
			{
				tmp = start;
				start = null;
				
			}
			else
			{
				System.out.println(i + " not found");
			}
		}
		
		// Deletion of first node
		
		if(start.data == i)
		{
			tmp = start;
			start = start.next;
			start.prev = null;
			
		}
		
		// deletion in between node
		
		tmp = start.next;
		while(tmp.next!=null)
		{
			if(tmp.data == i)
			{
				tmp.prev.next = tmp.next;
				tmp.next.prev = tmp.prev;
		
			}
			tmp = tmp.next;
		}
		
		// Deletion at the end
		
		if(tmp.data == i)
		{
			tmp.prev.next = null;
			
		}
		tmp = null;
		
	}
}
