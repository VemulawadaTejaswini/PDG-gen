
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[m];
		String[] s = new String[m];
		
		for (int i = 0; i < m; i++) {
			num[i] = sc.nextInt();
			s[i] = sc.next();
		}
		
		int[] cnt = new int[n];
		int[] wa = new int[n];
		for (int i = 0; i < m; i++) {
			if (s[i].equals("AC") && cnt[num[i] - 1] == 0) {
				cnt[num[i] - 1]++;
				continue;
			}
			
			if (s[i].equals("WA") && cnt[num[i] - 1] == 0) {
				wa[num[i] - 1]++;
			}
		}
		
		int a = 0;
		int w = 0;
		for (int i = 0; i < n; i++) {
			a += cnt[i];
			if (cnt[i] > 0) {
				w += wa[i];
			}
		}
		
		System.out.println(a + " " + w);

	}
}