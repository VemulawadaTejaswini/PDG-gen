import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		sc.close();

		if (K <= A) {
			A = A - K;
		} else if (K >= A + B) {
			A = 0;
			B = 0;
		} else {
			B = B - K + A;
			A = 0;
		}
		System.out.println(A + " " + B);
	}
}