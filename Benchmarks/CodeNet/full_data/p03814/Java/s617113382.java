import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String str = sc.next();
		int s = 0, e = 0, ans = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i).startsWith("A") && ans == 0) {
				s = i;
				ans = 1;
			}
			if (str.substring(i).startsWith("Z")) {
				e = i;
			}
		}
		
		ans = e - s + 1;
		
		System.out.println(ans);

		sc.close();
	}
}
