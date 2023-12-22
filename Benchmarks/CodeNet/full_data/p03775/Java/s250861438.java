import java.util.Scanner;
public class ABC057C {
	public static void main(String[] args) {
		ABC057CSolve solve = new ABC057CSolve();
		solve.main();
	}
}

class ABC057CSolve {
	
	long N;
	
	ABC057CSolve() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextLong();
	}
	
	void main() {
		long min = Long.MAX_VALUE / 2;
		if (N == 1) {
			System.out.println(1);
			return;
		}
		for (int i = 1; i <= N / 2; i++) {
			if (N % i == 0) {
				long a = i;
				long b = N / i;
				if (a > b) {
					break;
				}
				
				long f = F(a, b);
				min = Math.min(min, f);
			}
		}
		System.out.println(min);
	}
	
	int F(long a, long b) {
		int aCount = String.valueOf(a).length();
		int bCount = String.valueOf(b).length();
		return aCount > bCount ? aCount : bCount;
	}

}
