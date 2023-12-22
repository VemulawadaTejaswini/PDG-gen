import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long[] A = new long[(int)N];
		long[] B = new long[(int)N];
		Map<Long, Long> map = new TreeMap<>(Comparator.naturalOrder());
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
			map.put(A[i], B[i]);
		}
		sc.close();
		long sumKey = 0;
		long sumValue = 0;
		for(Map.Entry<Long, Long> entry : map.entrySet()) {
			for(int i = 0;i < entry.getValue();i++) {
				sumKey += entry.getKey();
				sumValue++;
				if(sumValue == M) {
					System.out.println(sumKey);
					return;
				}
			}
		}
	}
}