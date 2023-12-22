import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> S = new HashMap<>();
		long r = 0L;
		for(int i = 0; i < N; i++) {
			char[] s = sc.next().toCharArray();
			Arrays.sort(s);
			String ss = String.valueOf(s);
			int cnt = 0;
			if(S.containsKey(ss)) {
				cnt = S.get(ss);
				r += cnt;
			}
			S.put(ss, ++cnt);
		}
		sc.close();
		System.out.println(r);
	}
}