
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Map<String, Integer> set = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String e = new String(ch);
			
			set.compute(e, (k, v) -> {
				return v == null ? 0 : v + 1;
			});

		}
		
		long cnt = 0;
		for( Integer it : set.values() ) {
			long nn = it;
			cnt += nn*(nn+1)/2;
		}

		System.out.println(cnt);

	}
}
