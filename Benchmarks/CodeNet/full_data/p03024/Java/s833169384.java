import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int count = 0;
		for (char c : arr) {
			if (c == 'x') {
				count++;
			}
		}
		if (count >= 8) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
