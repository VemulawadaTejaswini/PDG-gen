import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]v = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = scan.nextInt();
		}
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for(int i = 0; i < n/2; i++) {
			map1.merge(v[2 * i], 1, (val1, val2) -> (val1 + val2));
			map2.merge(v[2 * i + 1], 1, (val1, val2) -> (val1 + val2));
		}
		if(map1.size() == 1 && map2.size() == 1) {
			if(v[0] != v[1]) {
				System.out.println(0);
			}else {
				System.out.println(n/2);
			}
			System.exit(0);
		}
		if(map1.size() == 1) {
			int kMax = -1;
			for(int k : map2.keySet()) {
				if(kMax < map2.get(k)) {
					kMax = k;
				}
			}
			if(v[0] != kMax) {
				int ans = n/2 -  map2.get(kMax);
				System.out.println(ans);
			}else {
				int t = kMax;
				kMax = -1;
				for(int k : map2.keySet()) {
					if(kMax < map2.get(k) && k != t) {
						kMax = k;
					}
				}
				int ans = n/2 - map2.get(kMax);
				System.out.println(ans);
			}
			System.exit(0);
		}
		if(map2.size() == 1) {
			int kMax = -1;
			for(int k : map1.keySet()) {
				if(kMax < map1.get(k)) {
					kMax = k;
				}
			}
			if(v[0] != kMax) {
				int ans = n/2 - map1.get(kMax);
				System.out.println(ans);
			}else {
				int t = kMax;
				kMax = -1;
				for(int k : map1.keySet()) {
					if(kMax < map1.get(k) && k != t) {
						kMax = k;
					}
				}
				int ans = n/2 - map1.get(kMax);
				System.out.println(ans);
			}
			System.exit(0);
		}
		int t0 = 0;
		int t1 = 0;
		int k0 = 0;
		int k1 = 0;
		int kMax = -1;
		for(int k : map1.keySet()) {
			if(kMax < map1.get(k)) {
				kMax = k;
			}
		}
		t0 = kMax;
		kMax = -1;

		for(int k : map1.keySet()) {
			if(kMax < map1.get(k) && k != t0) {
				kMax = k;
			}
		}
		t1 = kMax;
		kMax = -1;

		for(int k : map2.keySet()) {
			if(kMax < map2.get(k)) {
				kMax = k;
			}
		}
		k0 = kMax;
		kMax = -1;
		for(int k : map2.keySet()) {
			if(kMax < map2.get(k) && k != k0) {
				kMax = k;
			}
		}
		k1 = kMax;
		if(k0 != t0) {
			int ans = n - map1.get(t0) - map2.get(k0);
			System.out.println(ans);
			System.exit(0);
		}else {
			int m1 = n - map1.get(t0) - map2.get(k1);
			int m2 = n - map1.get(t1) - map2.get(k0);
			int ans = Math.min(m1, m2);
			System.out.println(ans);
		}
	}
}