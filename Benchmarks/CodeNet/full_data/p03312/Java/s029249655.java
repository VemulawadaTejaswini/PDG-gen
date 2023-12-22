
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n + 1];
		long[] sum = new long[n + 1];
		sum[0] = 0;
		for(int i = 1; i < n + 1; i++) {
			a[i] = sc.nextLong();
			sum[i] += sum[i - 1] + a[i];
		}
		long ans = Long.MAX_VALUE;
		int div1 = 1;
		int div2 = 1;
		for(int i = 3; i < n; i++) {
			long max1 = 0;
			long max2 = 0;
			long min1 = Long.MAX_VALUE;
			long min2 = Long.MAX_VALUE;
			long dis1 = Long.MAX_VALUE;
			long dis2 = Long.MAX_VALUE;
			for(int j = div1; j < i - 1; j++) {
				long tmp1 = sum[j];
				long tmp2 = sum[i - 1] - sum[j];
				if(dis1 > Math.abs(tmp1 - tmp2)) {
					max1 = Math.max(tmp1, tmp2);
					min1 = Math.min(tmp1, tmp2);
					dis1 = Math.abs(tmp1 - tmp2);
				} else {
					div1 = j - 1;
					break;
				}
			}
			if(div2 < i)
				div2 = i;
			for(int j = div2; j < n; j++) {
				long tmp1 = sum[j] - sum[i - 1];
				long tmp2 = sum[n] - sum[j];
				if(dis2 > Math.abs(tmp1 - tmp2)) {
					max2 = Math.max(tmp1, tmp2);
					min2 = Math.min(tmp1, tmp2);
					dis2 = Math.abs(tmp1 - tmp2);
				} else {
					div2 = j - 1;
					break;
				}
			}
			ans = Math.min(ans, Math.max(max1, max2) - Math.min(min1, min2));
		}
		System.out.println(ans);

	}

}
