import java.math.BigDecimal;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] matches = {0,2,5,5,4,5,6,3,7,6};
		int[] map = new int[M];
		for (int i = 0; i < M; i++) {
			map[i] = sc.nextInt();
		}
		
		String[] dp = new String[N+1];
		Arrays.fill(dp, "");
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < M; j++) {
				int count = matches[map[j]];
				if (i < count) {
					continue;
				}
				
				String now = dp[i-count].isEmpty() ? Integer.toString(map[j]) : maxString(dp[i-count], map[j]); 
				
				if (now.length() == 1 && i != count) 
					continue;
				
				
				if (comp(dp[i], now) < 0) {
					dp[i] = now;
				}
			}
		}
		
		System.out.println(dp[N]);
	}
	
	static String maxString(String s, int j) {
		
		int index = -1;
		for (int i = 0; i < s.length(); i++) {
			if (Character.getNumericValue(s.charAt(i)) <= j) {
				index = i;
				break;
			}
		}
		
		if (index == -1) {
			s += Integer.toString(j);
		} else {
			s = s.substring(0,index) + Integer.toString(j) + s.substring(index);
		}
		
		return s;
	}
	
	static int comp(String a, String b) {
		if (a.length() != b.length()) {
			return a.length() - b.length();
		}
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				return a.charAt(i) - b.charAt(i);
			}
		}
		
		return 0;
	}
		
}

