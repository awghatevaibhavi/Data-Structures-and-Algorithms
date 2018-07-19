
public class LinkedList {
	class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
		}
	}

	Node head;
	
	public void insertAtBeginning(int d) {
		Node newnode = new Node(d);
		if(head == null) {
			head = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void insertAfter(int index, int d) {
		int counter = 0;
		Node current = head;
		//System.out.println(current.data);
		Node newnode = new Node(d);
		while(counter < index) { 
			current = current.next;
			counter++;
		}
		newnode.next = current.next;
		current.next = newnode;
	}
	
	public void append(int d) {
		Node current = head;
		Node newnode = new Node(d);
		while(current.next != null)
			current = current.next;
		current.next = newnode;
	}
	
	public void print() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void delete(int d) {
		Node current = head, prev = head;
		while(current.data != d) {
			prev = current;
			current = current.next;
		}
		prev.next = current.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insertAtBeginning(1);
		ll.insertAtBeginning(2);
		ll.insertAtBeginning(3);
		ll.insertAfter(1, 4);
		ll.insertAfter(2, 5);
		ll.insertAfter(4, 6);
		ll.append(7);
		ll.append(8);
		ll.delete(5);
		ll.delete(1);
		ll.delete(8);
		ll.print();
	}

}


