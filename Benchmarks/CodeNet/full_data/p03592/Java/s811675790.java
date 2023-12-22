
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		if(K == 0) {
			System.out.println("Yes");
			return;
		}
		for(int i = 0 ; i <= N ; i ++) {
			for(int j = 0 ; j <= M ; j ++) {
				if(i * (M - j) + j * (N - i) == K) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}