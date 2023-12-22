import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int[] p = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
				43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 2; i <= N; i++) {
			int t = i;
			for(int k : p) {
				if(t == 1) break;
				while(t % k == 0) {
					map.merge(k, 1, (v1, v2) -> v1 + v2);
					t /= k;
				}
			}
		}
		int cnt = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		for(int k : map.keySet()) {
			//System.out.println(k +" " + map.get(k));
			int t = map.get(k);
			if(t >= 74) {
				a++;
			}
			if(t >= 24) {
				b++;
			}
			if(t >= 14) {
				c++;
			}
			if(t >= 4) {
				d++;
			}
			if(t >= 2) {
				e++;
			}
		}
		//System.out.println(a);
		cnt += a;
		cnt += b * (e - 1);
		cnt += c * (d - 1);
		cnt += (d * (d - 1) * (e - 2)) / 2;
		System.out.println(cnt);
	}
}