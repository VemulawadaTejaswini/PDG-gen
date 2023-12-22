import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean[] arr = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			int x = s.charAt(i) - 'a';
			if (arr[x]) {
				System.out.println("no");
				return;
			}
			arr[x] = true;
		}
		System.out.println("yes");
    }
}
