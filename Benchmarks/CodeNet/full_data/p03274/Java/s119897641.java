import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			long x = sc.nextLong();
			map[i] = x;
		}
		
		int zeroIndex = Arrays.binarySearch(map, 0);
		zeroIndex = Math.abs(zeroIndex + 1);
		
		int l = Math.max(zeroIndex, K);
		int start = l == zeroIndex ? zeroIndex - K : 0;
		
		int r = Math.min(N - zeroIndex, K);
		
		long min = Integer.MAX_VALUE;
		
		if (start == r) {
			min = 0;
		}
		
		for (int i = start; i < r; i++) {
			long left = Math.abs(map[i]);
			long rigth = Math.abs(map[i + (K - 1)]);
			
			if ((map[i] >= 0 && map[i + (K - 1)] >= 0) || (map[i] <= 0 && map[i + (K - 1)] <= 0)) {
				long tmp = Math.max(left, rigth);
				min = Math.min(tmp, min);
				continue;
			}
			
			min = Math.min(min, (left * 2) + rigth);
			min = Math.min(min, left + (rigth * 2));
		}
		
		System.out.println(min);
	}
}