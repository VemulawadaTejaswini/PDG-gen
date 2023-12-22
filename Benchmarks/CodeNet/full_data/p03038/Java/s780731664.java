import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int r = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();

		long[]dp=new long[11];
		dp[0] = X;

		for (int i = 1; i < 11; i++) {
			dp[i] = r * dp[i-1] - D;
			System.out.println(dp[i]);
		}

		sc.close();
	}

}
