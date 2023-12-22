import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P, Q, R;
		P = sc.nextInt();
		Q = sc.nextInt();
		R = sc.nextInt();

		System.out.println(Math.min(P + Q, Math.min(Q + R, R + P)));
	}
}