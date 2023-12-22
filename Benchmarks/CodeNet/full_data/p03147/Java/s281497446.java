import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
//	static int[] h = new int[N+2];
	static List<Integer> h = new ArrayList<>();
//	static LinkedHashSet<Integer> h = new LinkedHashSet<>();
	static List<Integer> valleys = new ArrayList<>();
	static List<Integer> mounts = new ArrayList<>();
	public static void main(String[] args) {
//		h[0] = 0; h[N+1] = 0;
		h.add(0);
		for (int i = 1; i <= N; i++) {
//			h[i] = Integer.parseInt(sc.next());
			int temp = Integer.parseInt(sc.next());
			if (temp == h.get(h.size()-1).intValue()) {
				continue;
			}
			h.add(temp);
		}
		h.add(0);
		for (int i = 1; i < h.size()-1; i++) {
//			if (h[i] > h[i-1] && h[i] > h[i+1]) {
//				mounts.add(h[i]);
//			}
//			if (h[i] < h[i-1] && h[i] < h[i+1]) {
//				valleys.add(h[i]);
//			}
			if (h.get(i) > h.get(i-1) && h.get(i) > h.get(i+1)) {
				mounts.add(h.get(i));
			}
			if (h.get(i) < h.get(i-1) && h.get(i) < h.get(i+1)) {
				valleys.add(h.get(i));
			}
		}
//		if (mounts.size() == 0 || mounts.size() == 1) {
//			Arrays.sort(h);
//			System.out.println(h[N+1]);
//			return;
//		}
		int ans = mounts.stream().mapToInt(Integer::intValue).sum()
				- valleys.stream().mapToInt(Integer::intValue).sum();
		System.out.println(ans);
	}
}