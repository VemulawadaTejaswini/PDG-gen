import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int ans = Integer.MAX_VALUE;
		for(int i = -100 ; i <= 100 ; i++) {
			int temp = 0;
			for(int j = 0 ; j < n ; j++) {
				temp += (i - a[j]) * (i - a[j]);
			}
			ans = Math.min(ans, temp);
		}
		System.out.println(ans);
	}
}
