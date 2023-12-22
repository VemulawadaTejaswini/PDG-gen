import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] rank = new int[n][m];
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < m; j++) {
		        rank[i][j] = sc.nextInt();
		    }
		}
		int[] idxes = new int[n];
		HashSet<Integer> set = new HashSet<>();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
		    int[] sports = new int[m];
		    for (int j = 0; j < n; j++) {
		        if (set.contains(rank[j][idxes[j]])) {
		            idxes[j]++;
		        }
		        sports[rank[j][idxes[j]] - 1]++;
		    }
		    int max = 0;
		    int maxIdx = 0;
		    for (int j = 0; j < m; j++) {
		        if (max < sports[j]) {
		            max = sports[j];
		            maxIdx = j;
		        }
		    }
		    min = Math.min(max, min);
		    set.add(maxIdx + 1);
		}
		System.out.println(min);
   }
   
}


