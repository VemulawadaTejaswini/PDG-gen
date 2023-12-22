import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int[] sum = new int[n];
		sum[0] = a[0];
		for(int i = 0 ; i < n - 1 ; i++) sum[i + 1] = sum[i] + a[i + 1];
		long ans = 0;
		System.out.println(Arrays.toString(sum));
		for(int i = 1 ; i < n ; i++) {
			if(sum[i - 1] > 0 && sum[i] > 0) {
				ans += sum[i] + 1;
				int temp = sum[i] + 1;
				for(int j = i ; j < n ; j++) sum[j] -= temp;
				System.out.println(Arrays.toString(sum));
//				ans += Math.abs(sum[i] + 1);
//				for(int j = i + 1 ; j < n ; j++) sum[j] -= sum[i] + 1;
			} else if(sum[i - 1] < 0 && sum[i] < 0) {
				ans += 1 - sum[i];
				int temp = 1 - sum[i];
				for(int j = i ; j < n ; j++) sum[j] += temp;
				System.out.println(Arrays.toString(sum));
//				ans += Math.abs(sum[i]);
//				for(int j = i + 1 ; j < n ; j++) sum[j] += Math.abs(sum[i]);
			} else if(sum[i] == 0) {
				ans += 1;
				if(sum[i - 1] > 0) {
					for(int j = i ; j < n ; j++) sum[j] -= 1;
				} else {
					for(int j = i ; j < n ; j++) sum[j] += 1;
				}
				System.out.println(Arrays.toString(sum));
			}
		}
		System.out.println(ans);
	}
}
// [1, -2, 1, 1]
// [1, -2, 1, -1]


// 1 1
// 1 -1
//

