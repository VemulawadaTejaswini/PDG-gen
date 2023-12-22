import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long y = sc.nextLong();
		for(long i = 0 ; i <= n ; i++) {
			for(long j = 0 ; i + j <= n ; j++) {
				for(long k = 0 ; i + j + k <= n ; k++) {
					if(i * 10000 + j * 5000 + k * 1000 == y) {
						System.out.println(i + " " + j + " " + k);
						return;
					}
				}
			}
		}
		System.out.println(-1 + " " + -1 + " " + -1);
	}
}
