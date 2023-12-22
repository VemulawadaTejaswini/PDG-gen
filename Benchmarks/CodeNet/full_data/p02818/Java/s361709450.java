import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		
		long ra;
		long rb;
		if (K > A) {
			ra = 0;
			rb = Math.max(0, B - K + A);
		} else {
			ra = A - K;
			rb = B;
		}
			
		System.out.println(ra+" "+rb);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}