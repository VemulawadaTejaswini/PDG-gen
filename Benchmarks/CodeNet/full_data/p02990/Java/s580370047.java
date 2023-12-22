import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		long c = 1000000007;
		long ans = (N - K + 1) % c;
		
		System.out.println(ans);
		
		long y = 1;
		long x = N - K + 1;
		long a = 0;
		
		for(long i = 2; i <= K; i++) {
			x = x * (N - K - a);
			a++;
			y = y * i;
			ans = x / y % c * (1 + K - i) % c;
			System.out.println(ans);
			
		}
	}
	
}
