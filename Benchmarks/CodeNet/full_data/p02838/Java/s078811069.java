import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] two = new int[61];
		
		for(int i = 0; i < N; i++) {
			long x = sc.nextLong();
			for(int j = 0; j < 61; j++) {
				two[j] += (int)(x % 2);
				x /= 2;
			}
		}
		
		long sum = 0;
		for(int i = 0; i < 61; i++) {
			sum += (Math.pow(2, i) * (two[i]*(N - two[i])));
			sum %= 1000000007;
		}
		System.out.println(sum);
	}
}