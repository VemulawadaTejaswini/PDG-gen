import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int q = sc.nextInt();
		boolean[][] field = new boolean[h + 1][w + 1];
		int[][] sums = new int[h + 1][w + 1];
		int[][] counts = new int[h + 1][w + 1];
		char[][] haCounts = new char[h + 1][w + 1];
		char[][] waCounts = new char[h + 1][w + 1];
		for (int i = 1; i <= h; i++) {
		    char[] arr = sc.next().toCharArray();
		    for (int j = 1; j <= w; j++) {
		        field[i][j] = arr[j - 1] == '1';
		        sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1];
		        if (field[i][j]) {
		            sums[i][j]++;
		        }
		        counts[i][j] = counts[i - 1][j] + counts[i][j - 1] - counts[i - 1][j - 1];
		        haCounts[i][j] = haCounts[i][j - 1];
		        if (field[i][j] && field[i - 1][j]) {
		            counts[i][j]++;
		            haCounts[i][j] = (char)(haCounts[i][j] + 1);
		        }
		        waCounts[i][j] = waCounts[i - 1][j];
		        if (field[i][j] && field[i][j - 1]) {
		            counts[i][j]++;
		            waCounts[i][j] = (char)(waCounts[i][j] + 1);
		        }
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
		    int ans = sums[x2][y2] - sums[x1 - 1][y2] - sums[x2][y1 - 1] + sums[x1 - 1][y1 - 1];
		    ans -= counts[x2][y2] - counts[x1 - 1][y2] - counts[x2][y1 - 1] + counts[x1 - 1][y1 - 1] - (haCounts[x1][y2] - haCounts[x1][y1 - 1]) - (waCounts[x2][y1] - waCounts[x1 - 1][y1]);
		    sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}
