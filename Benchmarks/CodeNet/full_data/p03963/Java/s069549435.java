
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long ans = 0;
		if (N == 1) {
			System.out.println(K);
		}else {
			ans = K * (long)Math.pow(K-1,N-1);
			System.out.println(ans);
		}

	}

}
