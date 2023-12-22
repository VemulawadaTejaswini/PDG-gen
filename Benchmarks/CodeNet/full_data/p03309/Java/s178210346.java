	import java.util.Arrays;
import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String[] t = sc.nextLine().split(" ");
			int n  	   = Integer.parseInt(t[0]);
			//long k = Long.parseLong(t[1].replaceAll("\\.", ""));

			String[] r = sc.nextLine().split(" ");
			int[] list = new int[n];
			int[] bist = new int[n];

			for(int i  = 0; i < n; i ++) {
				list[i] = Integer.parseInt(r[i]);
				bist[i] = Integer.parseInt(r[i]) - i;
			}

			Arrays.parallelSort(bist);
			int ans = 0;
			for(int i  = 0; i < n; i ++) {
				ans += Math.abs(list[i] - (bist[n / 2] + i));
			}

			System.out.println(ans);

		}
	}
