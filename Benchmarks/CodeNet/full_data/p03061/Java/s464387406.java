import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力1をnに入れる
		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		// 累積GCDの左右
		int[] left = new int[n+1];
		int[] right = new int[n+1];
		int[] middle = new int[n];

	    for (int i = 0; i < n; ++i) left[i+1] = gcd(left[i], a[i]);
	    for (int i = n-1; i >= 0; --i) right[i] = gcd(right[i+1], a[i]);

	    // 集計
		int ans = 1;
	    for (int i=0;i<n;++i) {
	    	// 更新
	    	middle[i]  = gcd(left[i], right[i+1]);
	    	ans = Math.max(ans, middle[i]);
	    }

		System.out.println(ans);
	}


	public static int gcd(int a, int b) {
		return b != 0 ? gcd(b, a % b) : a;
	}
}