import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int MOD = 1000*1000*1000+7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			b[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);

		int j = 0;
		int k = 0;

		long ans = 1;
		int status = 0;

		while (j<n || k<n) {
			if (j>=n || a[j]>b[k]) {
				if (status > 0) {
					ans = (ans*status)%MOD;
				}
				status--;
				k++;
			} else {
				if (status < 0) {
					ans = (ans*(-status))%MOD;
				}
				status++;
				j++;
			}
		}

		System.out.println(ans);
	}

}
