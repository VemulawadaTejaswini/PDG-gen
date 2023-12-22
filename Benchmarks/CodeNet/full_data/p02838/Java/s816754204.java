import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] two = new long[61];
		Arrays.fill(two, 0);
		
		for(int i = 0; i < N; i++) {
			long x = sc.nextLong();
			for(int j = 0; j < 61; j++) {
				two[j] += x & 1;
				x /= 2;
			}
		}
		sc.close();
		
		long sum = 0;
		for(int i = 0; i < 61; i++) {
			sum += (Math.pow(2, i) % 1000000007) * (two[i]*(N - two[i]));
			sum %= 1000000007;
		}
		System.out.println(sum);
	}
}