import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] inS = sc.next().toCharArray();
		char[] inT = sc.next().toCharArray();
		
		char[] s = new char[inS.length + 1];
		System.arraycopy(inS, 0, s, 1, inS.length);
		char[] t = new char[inT.length + 1];
		System.arraycopy(inT, 0, t, 1, inT.length);
		
//		System.out.println(Arrays.toString(s));
//		System.out.println(Arrays.toString(t));
		             
		
		int[][] dp = new int[s.length][t.length];
		for (int i = 1; i < s.length; i++) {
			for (int j = 1; j < t.length; j++) {
				if (s[i] == t[j]) dp[i][j] = dp[i - 1][j - 1] + 1;
				else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		
		char[] ans = new char[dp[s.length - 1][t.length - 1]];
		int idx = ans.length - 1;
		
		int i = s.length - 1;
		int j = t.length - 1;
		while (idx >= 0) {
			if (s[i] == t[j]) {
				ans[idx] = s[i];
				idx--;
				i--;
				j--;
			} else if (dp[i - 1][j] >= dp[i][j - 1]) {
				i--;
			} else {
				j--;
			}
		}
		
//		for (int[] arr : dp)
//			System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(ans));
		
		for (char c : ans)
			System.out.print(c);
		System.out.println();
		
		sc.close();
	}
}

