
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long M = sc.nextLong();
		Map<Long, Integer> div = new HashMap<>();
		while(M != 1) {
			long i = 2;
			while(true) {
				if(M % i == 0) {
					M /= i;
					if(div.containsKey(i)) {
						int value = div.get(i);
						value++;
						div.put(i, value);
					} else {
						div.put(i, 1);
					}
					break;
				}
				i++;
			}
		}
		long ans = 1;
		for(Map.Entry<Long, Integer> entry : div.entrySet()) {
			if(entry.getValue() >= N) {
				ans = Math.max(ans, entry.getKey());
			}
		}
		System.out.println(ans);
	}

}
