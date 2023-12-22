import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		if(n == 1) {
			System.out.println(Math.abs(a[n - 1] - w));
			return;
		}
		int ans = Math.max(Math.abs(a[n - 1] - w), Math.abs(a[n - 1] - a[n - 2]));
		System.out.println(ans);
	}
}
