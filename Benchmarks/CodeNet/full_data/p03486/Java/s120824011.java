
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		
		char[] list1 = s.toCharArray();
		
		Arrays.sort(list1);
		
		Character[] list2 = new Character[t.length()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = t.charAt(i);
		}
		Arrays.sort(list2,  Collections.reverseOrder());
		
		int n = Math.min(list1.length, list2.length);
		
		boolean flg = false;
		for (int i = 0; i < n; i++) {
			if (list1[i] > list2[i]) {
				flg = true;
				break;
			}
		}
		
		if (flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
