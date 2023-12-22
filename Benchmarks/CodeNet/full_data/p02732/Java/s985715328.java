
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] sum = new int[n + 1];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum[a[i]]++;
		}
		long ans = 0;
		for(int i = 1; i < n + 1; i++) {
			if(sum[i] >= 2) {
				ans += sum[i] * (sum[i] - 1) / 2;
			}
		}
		for(int i = 0; i < n; i++) {
			long tmp = ans;
			if(sum[a[i]] >= 2) {
				tmp -= sum[a[i]] * (sum[a[i]] - 1) / 2;
			}
			if(sum[a[i]] - 1 >= 2) {
				tmp += (sum[a[i]] - 1) * (sum[a[i]] - 2) / 2;
			}
			System.out.println(tmp);
		}
	}

}
