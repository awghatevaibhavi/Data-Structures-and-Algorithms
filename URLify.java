
public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mr John Smith    ";
		int len = 13;
		System.out.println(urlify(str, len));
	}

	private static String urlify(String str, int len) {
		// TODO Auto-generated method stub
		String app = "%20";
		StringBuilder res = new StringBuilder();
		for(int i=0; i < len; i++) {
			
			if(str.charAt(i) == ' ') 
				res.append(app);
			else {
				String temp = str.substring(i, i+1);
				res.append(temp);
			}
		}
		return res.toString();
	}

}
