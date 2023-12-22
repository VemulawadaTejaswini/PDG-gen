import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] cities = new int[m][3];//p, year, no
		int[][] sortedCities = new int[m][];
		for (int i = 0; i < m; i++) {
			cities[i][0] = sc.nextInt();
			cities[i][1] = sc.nextInt();
			sortedCities[i] = cities[i];
		}
		Arrays.sort(sortedCities, new Comparator<int[]>() {
		public int compare(int[] c1, int[] c2) {
			if (c1[0] != c2[0]) {
				return c1[0] - c2[0];
			} else {
				return c1[1] - c2[1];
			}
		}
		});
		int idx = 1;
		sortedCities[0][2] = idx;
		for (int i = 1; i < m; i++) {
			if (sortedCities[i - 1][0] == sortedCities[i][0]) {
				idx++;
			} else {
				idx = 1;
			}
			sortedCities[i][2] = idx;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			if (cities[i][0] < 10) {
				sb.append("00000");
			} else if (cities[i][0] < 100) {
				sb.append("0000");
			} else if (cities[i][0] < 1000) {
				sb.append("000");
			} else if (cities[i][0] < 10000) {
				sb.append("00");
			} else if (cities[i][0] < 100000) {
				sb.append("0");
			}
			sb.append(cities[i][0]);
			if (cities[i][2] < 10) {
				sb.append("00000");
			} else if (cities[i][2] < 100) {
				sb.append("0000");
			} else if (cities[i][2] < 1000) {
				sb.append("000");
			} else if (cities[i][2] < 10000) {
				sb.append("00");
			} else if (cities[i][2] < 100000) {
				sb.append("0");
			}
			sb.append(cities[i][2]);
			sb.append("\n");
		}
		System.out.print(sb);
		
	}
	
	
}