import java.util.Stack;

public class QueueViaStacks {
	Stack<Integer> newest;
	Stack<Integer> oldest;
	
	public QueueViaStacks() {
		// TODO Auto-generated constructor stub
		newest = new Stack<Integer>();
		oldest = new Stack<Integer>();
	}
	
	public void add(int d) {
		newest.push(d);
	}
	
	public void shiftStacks() {
		if(oldest.isEmpty()) {
			while(!newest.isEmpty()) {
				oldest.push(newest.pop());
			}
		}	
	}
	
	public int remove() {
		return oldest.pop();
	}
	
	public int peek() {
		return oldest.peek();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
