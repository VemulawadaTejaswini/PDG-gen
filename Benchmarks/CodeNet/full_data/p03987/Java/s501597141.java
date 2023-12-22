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
		
		long ans = 0;
		for(int i = n-1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				ans += a[j];
				a[j] = Math.min(a[j], a[j+1]);
			}
			ans += a[i];
		}
		
		System.out.println(ans);
		
		return;
	}
	
}