import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] field = new int[n][n];
		long total = 0;
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        field[i][j] = sc.nextInt();
		        total += field[i][j];
		    }
		}
		int[][] next = (int[][])(field.clone());
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        for (int k = 0; k < n; k++) {
		            if (i == j || j == k || i == k) {
		                continue;
		            }
		            if (next[j][k] > next[j][i] + next[i][k]) {
		                System.out.println(-1);
		                return;
		            } else if (next[j][k] == next[j][i] + next[i][k]) {
		                total -= next[j][k];
		            }
		        }
		    }
		}
        System.out.println(total / 2);
   }
}


