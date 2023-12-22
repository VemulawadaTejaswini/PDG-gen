import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long A = scn.nextInt();
		long B = scn.nextInt();
		long C = scn.nextInt();
		long X = scn.nextInt();
		long Y = scn.nextInt();
		long ans = Long.MAX_VALUE;
		for(long i = 0;i <= Math.max(X, Y);i++) {
			ans = Math.min(ans, A * (X-i) + B * (Y-i) + C * 2 * i);
		}
		System.out.println(ans);
	}

}
