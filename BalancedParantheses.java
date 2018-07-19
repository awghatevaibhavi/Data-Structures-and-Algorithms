import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedParantheses {
    
    	public static boolean isBalanced(String expression) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i< expression.length(); i++) {
    	        	if(expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[') 
    	        		s.push(expression.charAt(i));
    	        	else if(expression.charAt(i) == ')' || !s.isEmpty()) {
    	        		if(s.peek() == '(') {
    	        			s.pop();
    	        		}
    	        		else 
    	        			return false;
    	        	}
    	        	else if(expression.charAt(i) == '}' || !s.isEmpty()) {
    	        		if(s.peek() == '{') {
    	        			s.pop();
    	        		}
    	        		else 
    	        			return false;
    	        	}
    	        	else if(expression.charAt(i) == ']' || !s.isEmpty()) {
    	        		if(s.peek() == '[') {
    	        			s.pop();
    	        		}
    	        		else 
    	        			return false;
    	        	}
            		
            }
            return s.empty();
    	}
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

