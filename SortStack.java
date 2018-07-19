import java.util.Stack;

public class SortStack {
	
	public Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer> r = new Stack<Integer>();
		while(!s.isEmpty()) {
			int temp = s.pop();
			while(!r.isEmpty() && r.peek() > temp)
				s.push(r.pop());
			r.push(temp);
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortStack ss = new SortStack();
		Stack<Integer> s = new Stack<Integer>();
		s.push(5);
		s.push(4);
		s.push(7);
		s.push(3);
		Stack<Integer> r = ss.sort(s);
		System.out.println(r.pop());
		System.out.println(r.pop());
		System.out.println(r.pop());
		System.out.println(r.pop());
	}

}
