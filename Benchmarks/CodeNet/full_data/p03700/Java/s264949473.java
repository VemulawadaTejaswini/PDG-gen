import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int a = Integer.parseInt(sa[1]);
		int b = Integer.parseInt(sa[2]);
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		long start = 0;
		long end = 1000000000;
		while (Math.abs(end - start) > 1) {
			long mid = (end + start) / 2;
			if (calc(h, mid, a, b)) {
				end = mid;
			} else {
				start = mid;
			}
		}
		System.out.println(end);
	}

	static boolean calc(int[] h, long t, int a, int b) {
		long all = b * t;
		long one = a - b;
		long cnt = 0;
		for (int i = 0; i < h.length; i++) {
			long r = h[i] - all;
			if (r > 0) {
				cnt += (r + one - 1) / one;
				if (cnt > t) {
					return false;
				}
			}
		}
		return true;
	}
}
