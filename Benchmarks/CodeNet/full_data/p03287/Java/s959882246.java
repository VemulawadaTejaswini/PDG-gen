	import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String[] t = sc.nextLine().split(" ");
			int  n = Integer.parseInt(t[0]);
			long m = Long.parseLong(t[1]);

			String[] r = sc.nextLine().split(" ");
			long[] list = new long[n];
			long[] sum  = new long[n];

			sum[0]  = Integer.parseInt(r[0]);
			list[0] = Integer.parseInt(r[0]);
			for(int i = 1 ; i < n; i ++) {
				list[i] = Integer.parseInt(r[i]);
				sum[i]  = sum[i - 1] + list[i];
			}

			int cnt = 0;
			for(int i = 0; i < n; i++) {
				for(int j = i ; j < n; j++) {
					if(i >= 1) {
						cnt += (sum[j] - sum[i - 1]) % m == 0 ? 1 : 0;
					}else {
						cnt += sum[j] % m == 0? 1 : 0;
					}
				}
			}
			System.out.println(cnt);


		}
	}
