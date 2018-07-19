
public class StackUsingLinkedList {
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	Node top;
	
	public void push(int d) {
		Node newnode = new Node(d);
		if (top == null)
			top = newnode;
		else {
			newnode.next = top;
			top = newnode;
		}
	}
	
	public void pop() {
		if(isEmpty())
			System.out.println("Stack Empty");
		else {
			Node temp = top;
			top = temp.next;
			temp.next = null;
		}
	}
	
	public boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}
	
	public int peek() {
		return top.data;
	}
	
	public void print() {
		Node temp = top;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedList s = new StackUsingLinkedList();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		s.pop();
		s.pop();
		s.pop();
		s.print();
	}

}
