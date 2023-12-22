import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		sc.close();
		int pq = P + Q;
		int pr = P + R;
		int qr = Q + R;
		System.out.println(Math.min(pq, Math.min(pr, qr)));
	}
}
