
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] list = new long[n + 1];
		long[] sum = new long[n + 1];
		sum[0] = 0;
		for(int i = 1; i < n + 1; i++) {
			list[i] = sc.nextLong();
			sum[i] = sum[i - 1] + list[i];
		}
		long ans = 0;
		for(int l = 1; l < n + 1; l++) {
			long tmp = 0;
			for(int r = l; r < n + 1; r++) {
				long flag = tmp & list[r];
				if(flag == 0) {
					tmp = tmp | list[r];
				} else {
					ans += r + 1 - l;
					break;
				}
			}
		}
		System.out.println(ans);
	}

}
