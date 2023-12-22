import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.next());

		Integer[] A = new Integer[N + 1];
		Map<Integer, Integer> B = new HashMap<>();
		Map<Integer, Integer> C = new HashMap<>();
		
		int sum = 0;
		
		for(int i = 1; i <= N; ++i) {
			int in = Integer.parseInt(scan.next());
			A[i] = in;
		}
		
		for(int i = 1; i <= N; ++i) {
			B.put(A[i], Integer.parseInt(scan.next()));
		}
		
		for(int i = 1; i <= N - 1; ++i) {
			C.put(A[i], Integer.parseInt(scan.next()));
		}
		
		scan.close();
		A = null;
		
		for(int i = 1; i <= N - 1; ++i) {
			sum += B.get(i);
			
			if (i != N) {
				sum += C.get(i);
			}
		}
		
        System.out.println(sum);
	}
}