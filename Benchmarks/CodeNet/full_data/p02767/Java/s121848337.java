import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = kb.nextInt();
		}
		
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i <= 100; i++) {
			int cost = 0;
			for(int j = 0; j < n; j++)
				cost += (x[j] - (i+1))*(x[j] - (i+1));
			min = Math.min(cost, min);
		}
		
		System.out.println(min);
	}
}
