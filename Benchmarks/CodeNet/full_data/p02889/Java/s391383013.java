import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] gas = new int[n][n];
		int[][] counts = new int[n][n];
		for (int i = 0; i < n; i++) {
		    Arrays.fill(gas[i], l + 1);
		    Arrays.fill(counts[i], Integer.MAX_VALUE / 10);
		    gas[i][i] = 0; 
		    counts[i][i] = 0;
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    int c = sc.nextInt();
		    gas[a][b] = c;
		    gas[b][a] = c;
		}
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        for (int k = 0; k < n; k++) {
		            gas[j][k] = Math.min(gas[j][k], gas[j][i] + gas[i][k]);
		        }
		    }
		}
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (gas[i][j] <= l) {
                    counts[i][j] = 1;
                }
            }
        }
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        for (int k = 0; k < n; k++) {
		            counts[j][k] = Math.min(counts[j][k], counts[j][i] + counts[i][k]);
		        }
		    }
		}
		int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int s = sc.nextInt() - 1;
		    int t = sc.nextInt() - 1;
		    if (counts[s][t] >= Integer.MAX_VALUE / 10) {
		        sb.append(-1);
		    } else {
		        sb.append(counts[s][t] - 1);
		    }
		    sb.append("\n");
		}
	    System.out.print(sb);
    }
}
