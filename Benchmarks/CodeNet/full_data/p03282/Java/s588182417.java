import java.util.*;

public class Main {
	
	public static final int[] PRIME = new int[]{3 * 5 * 7, 3 * 5 * 11, 3 * 5 * 13, 3 * 3 * 3 * 5, 3 * 3 * 3 * 7};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		int start = 0;
		char value = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '1') {
				start = i;
				value = s.charAt(i);
				break;
			}
		}
		if (start >= k) {
			System.out.println(1);
		} else {
			System.out.println(value);
		}
	}
}