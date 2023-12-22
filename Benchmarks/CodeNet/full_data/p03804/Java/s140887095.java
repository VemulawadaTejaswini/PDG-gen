
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String[] ns = new String[n];
		for (int i = 0; i < ns.length; i++) {
			ns[i] = sc.next();
		}
		
		String[] ms = new String[m];
		for (int i = 0; i < ms.length; i++) {
			ms[i] = sc.next();
		}
		
		
		String ans = "No";
		outside: for (int i = 0; i < n; i++) {
			String target = ns[i];
			for (int j = 0; j <= n - m; j++) {
				String target2 = target.substring(j, j + m);
				if (target2.equals(ms[0])) {
					int cnt = 1;
					for (int k = 1; k < ms.length; k++) {
						String target3 = ns[i + k];
						String target4 = target3.substring(j, j + m);
						if (target4.equals(ms[k])) {
							cnt++;
						}
						if (cnt == m) {
							ans = "Yes";
							break outside;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}