import java.util.Scanner;
​
public class Main {
	
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		int numitems = kb.nextInt(), maxw = kb.nextInt();
		int[] v = new int[numitems];
		int[] w = new int[numitems];
		
		for(int i = 0; i < numitems; i++) {
			w[i] = kb.nextInt();
			v[i] = kb.nextInt();
		}
		System.out.println(knapsack(maxw, v, w));
	}
	static long knapsack(int maxw, int[] v, int[] w) {
		long[][] cache = new long[w.length+1][maxw+1];
		
		for(int i = 1; i<= w.length; i++) {
			for(int x = 1; x <= maxw; x++) {
				if(w[i-1] > x) {
					cache[i][x] = cache[i-1][x];
				}else {
					cache[i][x] = Math.max(cache[i-1][x], cache[i-1][x-w[i-1]] + v[i-1]);
				}
			}
		}
		return cache[v.length][maxw];
		
	}
}