import java.util.*;

class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		long N = sc.nextLong();
		for (long i = (long)Math.sqrt(N); i > 0; i--) {
			if (N%i==0) {
				System.out.println(i-1+(N/i)-1);
				return;
			}
		}
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}