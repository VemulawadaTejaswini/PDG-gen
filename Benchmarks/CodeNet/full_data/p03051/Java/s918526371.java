
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	long mod = 1_000_000_000 + 7;

	void run() {
		int n = sc.nextInt();

		long a[] = new long[n];
		long x[] = new long[n + 1];

		x[0] = 0;

		Map<Long, List<Integer>> map = new HashMap<Long, List<Integer>>();

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			x[i + 1] = x[i] ^ a[i];
			map.computeIfAbsent(x[i + 1], key -> new ArrayList<Integer>()).add(i + 1);
		}

		if (x[n] != 0) {
			System.out.println(1);
			return;
		}


		long sum = 0;

		List<Integer> zlist = map.get(0L);

		long ss = beki(1,zlist.size()-1);
		sum += ss % mod;

		for (Entry<Long, List<Integer>> e : map.entrySet()) {
			if (e.getKey() == 0) {
				continue;
			}
			List<Integer> tlist = e.getValue();

			long snake = countSnake(tlist,zlist);
			sum += snake ;
			while (sum > mod) {
				sum -= mod;
			}
			while(sum < 0) {
				sum += mod;
			}
		}

		System.out.println(sum);
	}
	
	long countSnake(List<Integer> t, List<Integer> z) {
		long zz = 1;
		long tt = 0;
		
		int ti = 0;
		int zi = 0;
		
		for(;;) {
			if(ti == t.size()) {
				if(zi == z.size()) {
					break;
				}
				zi++;
				zz += tt;
				zz %= mod;
			}else if(zi == z.size() || t.get(ti) < z.get(zi)) {
				ti++;
				tt += zz;
				tt %= mod;
				
			}else {
				zi++;
				zz += tt;
				zz %= mod;
			}
		}
		return tt;
	}
	
	long beki(long left,int k) {
		int d = 10;
		if(k >= d) {
			long ans = (left << d) % mod;
			return beki(ans,k-d);
		}
		long ans = (left << k) % mod;
		return ans;
	}
}
