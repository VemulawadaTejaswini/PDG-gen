import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int i = 0; i < n; i++) {
			long sum = 0;
			for(int j = i; j < n; j++) {
				sum += a[j];
				if(sum % m == 0) ans++;
			}
		}
		
		System.out.println(ans);
	}
}