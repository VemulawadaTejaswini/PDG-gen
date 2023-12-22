import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mod = (int)Math.pow(10, 9)+7;
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] bots = new int[n];
		int[] exits = new int[m];
		for (int i=0; i<n; i++) bots[i] = scanner.nextInt();
		for (int i=0; i<m; i++) exits[i] = scanner.nextInt();
		int bCur = 0;
		int eCur = 0;
		int[] botCounts = new int[m+1];
		Arrays.fill(botCounts, 0);
		while (bCur<n && eCur<m) {
			if (exits[eCur]<bots[bCur]) eCur++;
			else {
				botCounts[eCur]++;
				bCur++;
			}
		}
		botCounts[m] = n-bCur;
		long ans = 1;
		for (int i=0; i<m+1; i++){
			if (botCounts[i]!=0) {
				if (i!=0 && i!=m) ans = (ans*(botCounts[i]+1))%mod;
			}
		}
		System.out.println(ans);
	}
}