import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String,Long> map = new HashMap<>();
		long ans = 0;
		for(int i = 0;i < N;i++) {
			char[] c = sc.next().toCharArray();
			Arrays.sort(c);
			String s = new String(c);
			if(!map.containsKey(s)) {
				map.put(s, (long)0);
			}else {
				map.put(s, map.get(s)+1L);
				ans += map.get(s);
			}
		}
		sc.close();
		System.out.println(ans);
	}
}