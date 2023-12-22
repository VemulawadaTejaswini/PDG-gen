import java.util.*;
 
// ABC 19-C
// http://abc019.contest.atcoder.jp/tasks/abc019_3
 
public class Main {

	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[][] freq = new int[n][26];
		int[] answer = new int[26];
		
		for (int i = 0; i < n; i++) {
			char[] c = in.next().toCharArray();
			for (int j = 0; j < c.length; j++) {
				freq[i][c[j] - 'a']++;
				if (i == 0) {
					answer[c[j] - 'a'] = freq[i][c[j] - 'a'];
				}
			}
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < 26; j++) {
				answer[j] = Math.min(answer[j], freq[i][j]);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			if (answer[i] > 0) {
				for (int j = 0; j < answer[i]; j++) {
					System.out.printf("%c", i + 'a');
				}
			}
		}
		System.out.println();
		
//		int t = in.nextInt();
//		int num = 1;
//		while (t-- > 0) {
//			int n = in.nextInt();
//			
//			while (!isTidy(n)) {
//				n--;
//			}
//			System.out.printf("Case #%d: %d\n", num, n);
//			num++;
//		}
	}	
	
	public static boolean isTidy(int n) {
		if (n < 10) {
			return true;
		}
		int pre = n % 10;
		n /= 10;
		int curr = n % 10;
		
		while (n > 0) {
			if (pre < curr) {
				return false;
			}
			pre = curr;
			n /= 10;
			curr = n % 10;
		}
		return true;
	}
}
