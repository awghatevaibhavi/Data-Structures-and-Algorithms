import java.util.Arrays;
/*
 * An algorithm to decide whether one string is permutation of other string
 */
public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPermutation("aabc", "abad"));
	}

	private static boolean checkPermutation(String str1, String str2) {
		// TODO Auto-generated method stub
		char[] str1_array = str1.toCharArray();
		char[] str2_array = str2.toCharArray();
		Arrays.sort(str1_array);
		Arrays.sort(str2_array);
		if(str1_array.length == str2.length()) {
			for(int i=0; i< str1_array.length ; i++) {
				if(str1_array[i] == str2_array[i])
					continue;
				else
					return false;
			}
		}
		return true;
	}
}
