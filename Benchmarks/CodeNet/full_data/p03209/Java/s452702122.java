import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static long num = 0;
	static long patty = 0;
	static long n = 0;
	static long x = 0;
	static Map<Long,Long> numMap = new HashMap<Long,Long>();
	static Map<Long,Long> pattyMap = new HashMap<Long,Long>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		x = sc.nextLong();

		numMap.put(0L,1L);
		pattyMap.put(0L,1L);
		for (long i = 1 ; i <= 50 ; i++) {
			numMap.put(i, numMap.get(i-1)*2+3);
			pattyMap.put(i, pattyMap.get(i-1)*2+1);
		}

		level(n);
		// 出力
		System.out.println(patty);
		sc.close();
	}

	private static boolean level(long lev) {
		if ( (x - num) > numMap.get(lev)) {
			num += numMap.get(lev);
			patty += pattyMap.get(lev);
			return true;
		}

		if (lev == 0) {
			num++;
			patty++;
			if (num == x) return false;
			return true;
		} else {
			num++;
			if (num == x) return false;

			boolean b = level(lev - 1);
			if (b == false) return false;

			num++;
			patty++;
			if (num == x) return false;

			b = level(lev - 1);
			if (b == false) return false;

			num++;
			if (num == x) return false;

			return true;
		}
	}
}
