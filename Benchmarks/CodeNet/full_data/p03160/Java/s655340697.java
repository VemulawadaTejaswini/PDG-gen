import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		Arrays.setAll(h, i -> sc.nextInt());
		
		int[] cost = new int[n];
		Arrays.fill(cost, Integer.MAX_VALUE);
		cost[0] = 0;
		
		for (int i = 0; i < n - 1; i++) {
			int c1 = Math.abs(h[i + 1] - h[i]);
			cost[i + 1] = Math.min(cost[i + 1], c1 + cost[i]);
			
			if (i < n - 2) {
				int c2 = Math.abs(h[i + 2] - h[i]);
				cost[i + 2] = Math.min(cost[i + 2], c2 + cost[i]);
			}
		}
		
//		System.out.println(Arrays.toString(h));
//		System.out.println(Arrays.toString(cost));
		
		System.out.println(cost[n - 1]);
		
		sc.close();
	}

}


