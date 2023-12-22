import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N  = sc.nextLong();
		
		long p = 1;
		long c = 1000000007;
		
		for(long i = 1; i <= N; i++) {
			p = p % c * i % c;
		}
		System.out.println(p);
	}
}
