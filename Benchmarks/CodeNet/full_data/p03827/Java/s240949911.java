import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		String s = sc1.next();
		String[] sArray = s.split("");
		int ans = 0;
		int x = 0;
		for (int i = 0; i < n; i++) {
			if (sArray[i].equals("I")) {
				x = x + 1;
			} else {
				x = x - 1;
			}
			if (ans < x) {
				ans = x;
			}
		}
		System.out.println(ans);
	}
}
