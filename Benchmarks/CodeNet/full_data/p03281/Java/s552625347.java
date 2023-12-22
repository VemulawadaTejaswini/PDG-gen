	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.Set;

	public class Main{


		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			String[] temp = scanner.nextLine().split(" ");
			int n  = Integer.parseInt(temp[0]);

			long[] list  = divisor(n);
			int cnt = 0;
			for(long value : list) {
				cnt += value == 8 ? 1 : 0;
			}

			System.out.println(cnt);

		}
		private static long[] divisor(long num) {
			int MAX   = (int)num;
			long[] cnt = new long[(MAX + 2)];

			cnt[1] = 1;
			for(int i = 3; i <= MAX; i++) cnt[i] = 2;
			for(int i=2; i<=MAX/2; i++) {
				for(int j = 2*i; j <= MAX; j += i) {cnt[j]++;}
			}

			for(int i = 0; i < MAX+2; i++) {
				if(i % 2 == 0) cnt[i] = 0;
			}
			return cnt;

		}
	}
