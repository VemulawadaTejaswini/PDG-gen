
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		long[] t = new long[n];
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
			t[i] = sc.nextLong();
		}
		String x = sc.next();
		boolean flag = true;
		long ans = 0;
		for(int i = 0; i < n; i++) {
			if(flag) {
				if(s[i].equals(x)) {
					flag = false;
				}
			} else {
				ans += t[i];
			}
		}
		System.out.println(ans);
	}

}
