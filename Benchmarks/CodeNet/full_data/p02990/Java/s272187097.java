import java.util.*;

public class Main {
    static final int MOD = 1000000007;
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long[][] comb = new long[2001][2001];
		for (int i = 0; i <= 2000; i++) {
		    for (int j = 0; j <= i; j++) {
		        if (j == 0 || j == i) {
		            comb[i][j] = 1;
		        } else {
		            comb[i][j] = (comb[i - 1][j] + comb[i - 1][j - 1]) % MOD;
		        }
		    }
		}
		int n = sc.nextInt();
		int blue = sc.nextInt();
		int red = n - blue;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= blue; i++) {
		    long blueCount = comb[blue - 1][i - 1];
		    long redCount = comb[red + 1][i];
		    sb.append((blueCount * redCount) % MOD).append("\n");
		}
		System.out.print(sb);
   }
}


