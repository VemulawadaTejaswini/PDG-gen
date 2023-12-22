import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			map.put(i, a);
			A[i] = a;
		}
		sc.close();
		// System.out.println("--------------");
		Arrays.sort(A);
		for(int i = 0; i < N; i++) {
			int except = map.get(i);
			System.out.println(A[N - 1] == except ? A[N - 2] : A[N - 1]);
		}
	}
}	
