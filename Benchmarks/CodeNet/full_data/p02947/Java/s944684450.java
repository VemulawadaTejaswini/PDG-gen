import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			StringBuilder S = new StringBuilder();
			char[] s = sc.next().toCharArray();
			Arrays.sort(s);
			map.merge(new String(s), 1, Integer::sum);
		}
		long ans = 0;
		for(String s : map.keySet())
			ans += map.get(s)*(map.get(s)-1)/2;
		System.out.println(ans);

	}

}