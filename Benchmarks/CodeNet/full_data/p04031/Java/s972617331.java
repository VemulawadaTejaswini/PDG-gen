import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line);
		line = br.readLine();
		String[] sp = line.split(" ");
		int[] a = new int[n];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sp[i]);
			min = Math.min(a[i] , min);
			max = Math.max(a[i] , max);
		}
		int minCost = Integer.MAX_VALUE;
		for (int i = min; i <= max; i++) {
			int cost = 0;
			for (int j = 0; j < n; j++) {
				cost += Math.pow(a[j] - i, 2);
			}
			minCost = Math.min(cost, minCost);
		}
		System.out.println(minCost);
	}

}
