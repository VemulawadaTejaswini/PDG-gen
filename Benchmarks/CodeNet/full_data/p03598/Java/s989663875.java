
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),K = sc.nextInt();
		int ans = 0;
		for(int i = 0; i< N; i++) {
			int b = sc.nextInt();
			int min = Math.min(K-b, b);
			ans += min*2;
		}
		System.out.println(ans);
	}
}
