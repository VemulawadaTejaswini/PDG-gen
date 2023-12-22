import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int n = s.length();
		long ans = 0;
		for(int mask = 0 ; mask < (1<<(n - 1)) ; mask++) {
			String a = "";
			for(int i = 0 ; i < n ; i++) {
				if((mask & (1<<i)) != 0) {
					a += c[i] + "+";
				} else {
					a += c[i];
				}
			}
			a = a.replace("+", "A");
			String[] b = a.split("A");
			for(int i = 0 ; i < b.length ; i++) {
				ans += Long.valueOf(b[i]);
			}
		}
		System.out.println(ans);
	}
}
