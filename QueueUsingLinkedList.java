
public class QueueUsingLinkedList {
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	Node first;
	Node last;
	
	public void add(int d) {
		Node newnode = new Node(d);
		if(first == null) {
			first = newnode;
			last = newnode;
		}
		else {
			last.next = newnode;
			last = newnode;
		}
	}
	
	public void remove() {
		if(isEmpty())
			System.out.println("Queue Empty");
		else {
			Node temp = first;
			first = temp.next;
			temp.next = null;
		}
	}
	
	public int peek() {
		return first.data;
	}
	
	public boolean isEmpty() {
		if(first == null)
			return true;
		return false;
	}
	
	public void print() {
		Node temp = first;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.remove();
		q.remove();
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		q.remove();
		q.remove();
		q.remove();
		q.print();
		
	}

}
