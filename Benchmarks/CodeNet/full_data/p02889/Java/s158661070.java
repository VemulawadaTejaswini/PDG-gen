import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] gas = new int[n + 1][n + 1];
		int[][] counts = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
		    Arrays.fill(gas[i], Integer.MAX_VALUE / 2 - 1);
		    Arrays.fill(counts[i], Integer.MAX_VALUE / 2 - 1);
		    gas[i][i] = 0;
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    gas[a][b] = c;
		    gas[b][a] = c;
		}
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n; j++) {
		        for (int k = 1; k <= n; k++) {
		            gas[j][k] = Math.min(gas[j][k], gas[j][i] + gas[i][k]);
		        }
		    }
		}
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n; j++) {
		        if (i == j) {
		            counts[i][j] = 0;
		        } else if (gas[i][j] <= l) {
		           counts[i][j] = 1;
		        }
		    }
		}
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n; j++) {
		        for (int k = 1; k <= n; k++) {
		            counts[j][k] = Math.min(counts[j][k], counts[j][i] + counts[i][k]);
		        }
		    }
		}
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int s = sc.nextInt();
		    int t = sc.nextInt();
		    if (counts[s][t] == Integer.MAX_VALUE / 2 - 1) {
		        sb.append(-1);
		    } else {
		        sb.append(counts[s][t] - 1);
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
}
