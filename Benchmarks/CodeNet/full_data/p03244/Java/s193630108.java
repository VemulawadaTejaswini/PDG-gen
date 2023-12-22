
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> even = new HashMap<>();
		Map<Integer, Integer> odd = new HashMap<>();
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			Map<Integer, Integer> mp = null;
			if(i % 2 == 0) {
				mp = even;
			}else {
				mp = odd;
			}
			if(mp.containsKey(num)) {
				mp.put(num, mp.get(num) + 1);
			}else {
				mp.put(num, 1);
			}
		}
		int even_g_num = 0;
		int even_g_cnt = 0;
		int even_g_sec_num = 0;
		int even_g_sec_cnt = 0;
		int odd_g_num = 0;
		int odd_g_cnt = 0;
		int odd_g_sec_num = 0;
		int odd_g_sec_cnt = 0;
		for(int i : even.keySet()) {
			int cnt = even.get(i);
			if(cnt > even_g_cnt) {
				even_g_num = i;
				even_g_cnt = cnt;
			}else if(even_g_sec_cnt < cnt) {
				even_g_sec_num = i;
				even_g_sec_cnt = cnt;
			}
		}
		for(int i : odd.keySet()) {
			int cnt = odd.get(i);
			if(cnt > odd_g_cnt) {
				odd_g_num = i;
				odd_g_cnt = cnt;
			}else if(odd_g_sec_cnt < cnt) {
				odd_g_sec_num = i;
				odd_g_sec_cnt = cnt;
			}
		}
		if(even_g_num == odd_g_num) {
			System.out.println(Math.min(N -(even_g_cnt + odd_g_sec_cnt), N - (odd_g_cnt + even_g_sec_cnt)));
		}else {
			System.out.println(N - (even_g_cnt + odd_g_cnt));
		}

	}

}
