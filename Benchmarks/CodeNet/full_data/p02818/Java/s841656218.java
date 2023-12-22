import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		
		if ((A+B) <= K) {
			System.out.println(0 + " " + 0);
		} else if (K < A) {
			System.out.println((K-A) + " " + B);
		} else {
			System.out.println(0 + " " + (B-K+A));
		}
	}
}