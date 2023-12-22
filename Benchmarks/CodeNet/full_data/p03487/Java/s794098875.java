import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Long, Long> map = new HashMap<Long, Long>();

		int s = in.nextInt();
		for (int i = 1; i <= s; i++) {
			long tmpKey = in.nextLong();
			if (map.containsKey(tmpKey)) {
				long curVal = map.get(tmpKey);
				map.replace(tmpKey, curVal + 1);
				continue;
			}
			map.put(tmpKey, 1l);
		}
		long counter = 0l;
		for (long k : map.keySet()) {
			long tmpRes = map.get(k) - k;
			if (tmpRes < 0) {
				counter += map.get(k);
			} else {
				counter += tmpRes;
			}
		}
		System.out.println(counter);
	}

}