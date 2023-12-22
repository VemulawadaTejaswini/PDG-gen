import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			long l = b[i] + a[i] * W;
			out : for(int y = 0; y < 3; y++) {
				if(a[i] - y < 0 || a[i] - y >= H - 2) continue out;
				in : for(int x = 0; x < 3; x++) {
					if(b[i] - x < 0 || b[i] - x >= W - 2) continue in;
					if(map.containsKey(l - x - y * W)) {
						map.put(l - x - y * W, map.get(l - x - y * W) + 1);
					} else {
						map.put(l - x - y * W, 1);
					}
				}
			}
		}
		
		long ans[] = new long[10];
		int cnt = 0;
		for(long key : map.keySet()) {
			ans[map.get(key)]++;
			cnt++;
		}
		ans[0] = (H - 2) * (W - 2) - cnt;
		for(int i = 0; i < 10; i++) {
			System.out.println(ans[i]);
		}
	}
}
