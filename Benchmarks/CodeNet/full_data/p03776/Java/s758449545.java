import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int a = Integer.parseInt(sa[1]);
		int b = Integer.parseInt(sa[2]);
		sa = br.readLine().split(" ");
		List<Long> list = new ArrayList<Long>(n);
		for (int i = 0; i < n; i++) {
			list.add(Long.parseLong(sa[i]));
		}
		br.close();

		Collections.sort(list);
		Collections.reverse(list);

		long sum = 0;
		double m = 0;
		for (int i = 0; i < b; i++) {
			sum += list.get(i);
			if (i >= a - 1) {
				double d = (double) sum / (i + 1);
				m = Math.max(m, d);
			}
		}
		System.out.println(new BigDecimal(m).toString());

		long cnt1 = 0;
		long cnt2 = 0;
		long va = list.get(a - 1);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > va) {
				cnt1++;
			} else if (list.get(i) == va) {
				cnt2++;
			}
		}

		long ans = 0;
		long f = (long) Math.floor(m);
		long c = (long) Math.floor(m);
		if (f == c && f == va) {
			for (int i = a; i <= b; i++) {
				ans += nCr(cnt2, i - cnt1);
			}
		} else {
			ans += nCr(cnt2, a - cnt1);
		}
		System.out.println(ans);
	}

	static long nCr(long n, long r) {
		long val = 1;
		for (long i = 1; i <= r; i++) {
			val = val * (n - i + 1) / i;
		}
		return val;
	}
}
