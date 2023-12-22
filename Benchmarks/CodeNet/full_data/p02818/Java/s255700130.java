import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		long A = scanner.nextLong();
 		long B = scanner.nextLong();
 		long K = scanner.nextLong();
 		if (K - A >= 0) {
 			B = B - K + A;
 			A = 0;
 		} else {
 			A = A - K;
 		}
 		System.out.println(A + " " + B);
	}
}
