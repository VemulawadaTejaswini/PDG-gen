import java.util.Scanner;
public class solve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextInt();
		int DP[] = new int[n];
		DP[0] = 0;
		DP[1] = Math.abs(a[0] - a[1]);
		for (int i = 2; i < n; i++) {
			DP[i] = Math.min(DP[i - 1] + Math.abs(a[i] - a[i - 1]), DP[i - 2] + Math.abs(a[i] - a[i - 2]));
		}
		System.out.print(DP[n - 1]);
	}

}
