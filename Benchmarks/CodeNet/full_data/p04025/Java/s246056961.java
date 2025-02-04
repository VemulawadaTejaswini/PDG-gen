import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		int ans = Integer.MAX_VALUE;
		for(int k = -100; k <= 100; k++) {
			int cost = 0;
			for(int i = 0; i < n; i++) {
				cost += (a[i] - k) * (a[i] - k);
			}
			ans = Math.min(ans, cost);
		}
		
		System.out.println(ans);
	}
	
}