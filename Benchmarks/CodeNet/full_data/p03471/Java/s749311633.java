import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Long Y = sc.nextLong();
		
		for (int a = 0; a <= N; a++) {
			for (int b = 0; b <= N - a; b++) {
				int c = N - a - b;
				long sum = (a * 10000L) + (b * 5000L) + (c * 1000L);
				if (sum == Y) {
					System.out.println(a + " " + b + " " + c);
					return;
				}
			}
		}
		
		System.out.println("-1 -1 -1");
	}
}