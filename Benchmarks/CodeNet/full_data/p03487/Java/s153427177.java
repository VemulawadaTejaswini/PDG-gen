import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> ma = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			ma.put(a, ma.get(a) == null ? 1 : ma.get(a) + 1);
		}
		int ans = 0;
		for (Integer i : ma.keySet()) {
			ans += ma.get(i) >= i ? ma.get(i) - i : ma.get(i);
		}
		System.out.println(ans);
	}
}