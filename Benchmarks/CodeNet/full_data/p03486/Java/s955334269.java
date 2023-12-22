import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		Arrays.sort(s);
		for(int i = 0 ; i < t.length - 1 ; i++) {
			for(int j = i + 1 ; j < t.length ; j++) {
				if(t[i] < t[j]) {
					char temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
			}
		}
		String S = new String(s);
		String T = new String(t);
		if(S.compareTo(T) < 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
