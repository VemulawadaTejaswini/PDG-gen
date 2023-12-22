import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long [] s = new long[n + 1];
		long ans = 1000000000;
		for(int i = 1;i <= n;i ++) {
			s[i] = in.nextLong();
			s[i] += s[i - 1];
		}
		for(int i = 1;i <= n - 3;i ++) {
			for(int j = i + 1;j <= n - 2;j ++) {
				for(int k = j + 1;k <= n - 1;k ++) {
					long max = s[i],min = s[i];
					max = Math.max(max, s[j] - s[i]);
					min = Math.min(min, s[j] - s[i]);
					max = Math.max(max, s[k] - s[j]);
					min = Math.min(min, s[k] - s[j]);
					max = Math.max(max, s[n] - s[k]);
					min = Math.min(min, s[n] - s[k]);
					ans = Math.min(ans, max - min);
				}
			}
		}
		System.out.println(ans);
	}
}
