import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long []a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		long []b = new long[N + 1];
		for(int i = 1; i <= N; i++) {
			b[i] += b[i - 1] + a[i - 1];
		}
		int l = N * (N + 1) / 2;
		long []c = new long[l];
		int idx = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j <= N; j++) {
				c[idx] = b[j] - b[i];
				idx++;
			}
		}
		Arrays.sort(c);
		String []bit = new String[l];
		for(int i = 0; i < l; i++) {
			bit[i] = Long.toBinaryString(c[i]);
		}
//		for(String s : bit) {
//			System.out.println(s);
//		}
		Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
		List<Integer> key = new ArrayList<Integer>();
		for(int i = 0; i < l; i++) {
			String t = bit[i];
			int len = t.length();
			for(int j = 0; j < t.length(); j++) {
				if(t.charAt(j) == '1') {
					if(map.containsKey(len - j)) {
						map.get(len - j).add(t);
					}else {
						List<String> list = new ArrayList<String>();
						list.add(t);
						map.put(len - j, list);
						key.add(len - j);
					}
				}
			}
		}
		Collections.sort(key, Collections.reverseOrder());
		List<Long> d = new ArrayList<Long>();
		for(int k : key) {
			if(map.get(k).size() >= K) {
				for(String s : map.get(k)) {
					d.add(Long.parseLong(s, 2));
				}
				break;
			}
		}
		if(d.size() == 0) {
			System.out.println(0);
		}else {
			Collections.sort(d, Collections.reverseOrder());
//			for(long t : d) {
//				System.out.println(t);
//			}
			long ans = d.get(0);
			for(int i = 1; i < K; i++) {
				ans = ans & d.get(i);
			}
			System.out.println(ans);
		}
	}
}