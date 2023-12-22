import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] cities = new int[m][4];//p, year, idx, no
		for (int i = 0; i < m; i++) {
			cities[i][0] = sc.nextInt();
			cities[i][1] = sc.nextInt();
			cities[i][2] = i;
		}
		Arrays.sort(cities, new Comparator<int[]>() {
		public int compare(int[] c1, int[] c2) {
			if (c1[0] != c2[0]) {
				return c1[0] - c2[0];
			} else {
				return c1[1] - c2[1];
			}
		}
		});
		int idx = 1;
		cities[0][3] = idx;
		for (int i = 1; i < m; i++) {
			if (cities[i - 1][0] == cities[i][0]) {
				idx++;
				cities[i][3] = idx;
			} else {
				idx = 1;
				cities[i][3] = idx;
			}
		}
		Arrays.sort(cities, new Comparator<int[]>() {
		public int compare(int[] c1, int[] c2) {
			return c1[2] - c2[2];
		}
		});
		for (int i = 0; i < m; i++) {
			System.out.println(String.format("%06d", cities[i][0]) + String.format("%06d", cities[i][3]));
		}
		
	}
	
	
}