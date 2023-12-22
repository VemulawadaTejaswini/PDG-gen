
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static long N;
	public static long M;
	public static long divide = 1000000007;
	public static Map<Long, Long> div = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextLong();
		while(M != 1) {
			for(long i = 2; i < M + 1; i++) {
				if(M % i == 0) {
					if(div.containsKey(i)) {
						long value = div.get(i);
						div.put(i, value + 1);
					} else {
						div.put(i, 1l);
					}
					break;
				}
			}
		}
		long ans = 0;
		for(Map.Entry<Long, Long> e : div.entrySet()) {
			ans = ((Calc(e.getValue(), 1) % divide) * ans) % divide;
		}
		System.out.println(ans);

	}

	public static long Calc(long num, long pos) {
		if(pos <= N || num == 0) {
			return 1;
		} else {
			long count = 0;
			for(long i = num; i > 0; i++) {
				count = (count + Calc(num - i, pos + 1)) % divide;
			}
			return count;
		}
	}

}
