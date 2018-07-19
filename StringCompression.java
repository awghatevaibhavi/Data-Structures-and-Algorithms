
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabcccccaaab";
		System.out.println(compress(input));
	}

	private static String compress(String input) {
		// TODO Auto-generated method stub
		StringBuilder res = new StringBuilder();
		int count = 1;
		for(int i = 1 ; i < input.length(); i++) {
			if(input.charAt(i) == input.charAt(i-1)) {
				count++;
			}
			else {
				res.append(input.charAt(i-1));
				res.append(count);
				count = 1;
			}
			if( i == input.length()-1) {
				res.append(input.charAt(i));
				res.append(count);
			}
		}
		return res.toString();
	}

}
