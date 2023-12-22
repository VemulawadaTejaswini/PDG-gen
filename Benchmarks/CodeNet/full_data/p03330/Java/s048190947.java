import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] matrix = new int[c + 1][c + 1];
		for (int i = 1; i <= c; i++) {
		    for (int j = 1; j <= c; j++) {
		        matrix[i][j] = sc.nextInt();
		    }
		}
		int[][] costs = new int[3][c + 1];
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n; j++) {
		        int type = (i + j) % 3;
		        int color = sc.nextInt();
		        for (int k = 1; k <= c; k++) {
		            costs[type][k] += matrix[color][k];
		        }
		    }
		}
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= c; i++) {
		    for (int j = 1; j <= c; j++) {
		        if (i == j) {
		            continue;
		        }
		        for (int k = 1; k <= c; k++) {
		            if (i == k || j == k) {
		                continue;
		            }
		            min = Math.min(min, costs[0][i] + costs[1][j] + costs[2][k]);
		        }
		    }
		}
		System.out.println(min);
    }
}

