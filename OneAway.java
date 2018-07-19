
public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "pale";
		String second = "bake";
		System.out.println(oneaway(first, second));
	}

	private static boolean oneaway(String first, String second) {
		// TODO Auto-generated method stub
		if(first.length() == second.length())
			return OneEditReplace(first, second);
		else if(first.length()+1 == second.length())
			return OneEditInsert(first, second);
		else if(first.length()-1 == second.length())
			return OneEditInsert(second, first);
		return false;
	}

	private static boolean OneEditInsert(String s1, String s2) {
		// TODO Auto-generated method stub
		int index1 = 0;
		int index2 = 0;
		while(index1 < s1.length() && index2 < s2.length()) {
			if(s1.charAt(index1) != s2.charAt(index2)) {
				if(index1 != index2)
					return false;
				index2++;
			}
			else {
				index1++;
				index2++;
			}
		}
		return true;
	}

	private static boolean OneEditReplace(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean foundDifference = false;
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(foundDifference)
					return false;
				foundDifference = true;
			}
		}
		return true;
	}

}
