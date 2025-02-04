import java.util.Scanner;

public class Main {
	static String[] dic = {"dream","dreamer","erase","eraser"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		System.out.println(s.matches("(dream|dreamer|erase|eraser)*") ? "YES" : "NO");
		int n = s.length();
		boolean[] dp = new boolean[n+1];
		dp[0] = true;
		for(int i=0;i<n;i++) {
			if (!dp[i]) {
				continue;
			}
			for(String t: dic) {
				int m = t.length();
				if (s.length() < i + m) {
					continue;
				}
				if (s.substring(i,i+t.length()).equals(t)) {
					dp[i+t.length()] = true;
				}
			}
		}
		System.out.println(dp[n] ? "YES" : "NO");
	}

}
