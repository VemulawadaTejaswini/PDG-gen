import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ans = 0;
		long a,b;
		for(int i = 0;i < N; i++) {
			a = sc.nextLong();
			b = sc.nextLong();
			ans += b - a;
		}
		System.out.println(ans + N);
	}
}