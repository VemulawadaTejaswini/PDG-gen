import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long P = sc.nextLong();
		
		if (N == 1) {
			System.out.println(P);
			return;
		}
		
		int pSqrt = (int)Math.sqrt(P) + 1;
		int[] map = new int[pSqrt];
		for (int i = 2; i < pSqrt; i++) {
			while(P % i == 0) {
				map[i]++;
				P /= i;
			}
		}
		
		long max = 1;
		for (int i = 0; i < map.length; i++) {
			if (map[i] >= N) {
				max *= i;
			}
		}
		
		System.out.println(max);
	}
}
