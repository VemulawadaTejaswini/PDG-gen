import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int START = 1;
	static final int END = 100;
	static final int MAX_COST = 1_000_000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		Arrays.setAll(x, i -> sc.nextInt());
		
		int minCost = MAX_COST;
		for (int p = START; p <= END; p++) {
			int cost = 0;
			for (int i = 0; i < n; i++) {
				cost += (int) Math.pow(x[i] - p, 2);
			}
			
			if (cost < minCost) {
				minCost = cost;
			}
		}
		
		System.out.println(minCost);
		
		sc.close();
	}
}




