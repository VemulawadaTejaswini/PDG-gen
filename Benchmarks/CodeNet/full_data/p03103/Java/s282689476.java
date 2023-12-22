import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			if(map.get(A[i])!=null) {
				map.put(A[i], B[i]+map.get(A[i]));
			}else {
				map.put(A[i], B[i]);
			}
		}
		sc.close();
		long sumKey = 0;
		long sumValue = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
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