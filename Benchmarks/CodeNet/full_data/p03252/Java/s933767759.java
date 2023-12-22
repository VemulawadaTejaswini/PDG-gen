import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		String s = sc.next();
		char[] c = new char[1000];
		Arrays.fill(c, '0');
		for(int i = 0 ; i < s.length() ; i++) {
			if(c[s.charAt(i)] == '0') {
				c[s.charAt(i)] = t.charAt(i);
			}
			else if(c[s.charAt(i)] != t.charAt(i)){
				System.out.println("No");
				return;
			}
		}

		sc.close();
		System.out.println("Yes");

	}
}

