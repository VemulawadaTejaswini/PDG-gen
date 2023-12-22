import java.util.*;
import java.io.*;

class Main {
	public static void main(String... args) {
		int L = IN.nextInt();
		
		List<Integer> nums = new ArrayList<>();
		int i = 18;
		int a = L;
		while (a > 0) {
			int b = (int) Math.pow(2, i);
			if (b <= a) {
				nums.add(i + 1);
				a -= b;
			} else {
				i -= 1;
			}
		}
		
		int N = nums.get(0) + 1;
		
		List<int[]> G = new ArrayList<>();
		for (int n = 1; n <= N - 2; n++) {
			G.add(new int[] {n, n + 1, 0});
			G.add(new int[] {n, n + 1, (int) Math.pow(2, n - 1)});
		}
		
		int base = 0;
		Collections.reverse(nums);
		for (int j: nums) {
			G.add(new int[] {j, N, base});
			base += (int) Math.pow(2, j -1);
		}

		puts(N + " " + G.size());
		for (int[] x: G) {
			puts(x[0] + " " + x[1] + " " + x[2]);
		}
		flush();
	}

	static final Scanner IN = new Scanner(System.in);
	static final PrintWriter OUT = new PrintWriter(System.out);
	static <T> void puts(T arg) { OUT.println(arg); }
	static void flush() { OUT.flush(); }
}
