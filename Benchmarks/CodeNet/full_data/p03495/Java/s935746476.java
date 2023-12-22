import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Map<Integer, Integer> ma = new HashMap<>();
		for (int i = 0; i < N; i++) {
			ma.merge(sc.nextInt(), 1, Integer::sum);
		}
		List<Integer> nums = new ArrayList<>(ma.values());
		Collections.sort(nums);
		int nowk = ma.size();
		int ans = 0;
		for (int i=0; nowk > K; i++, nowk--) {
			ans += nums.get(i);
		}
		System.out.println(ans);
	}
}