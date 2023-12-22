import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		
		if (K > A) {
			System.out.println(0 + " " + Math.abs(B-(K-A)));
		} else if (K < A) {
			System.out.println((K-A) + " " + B);
		}
	}
}
