import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static long solve() {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long sum = 0;
		
		int i = 0;
		while (N != 0) {
			sum += Math.pow(2, i);
			N /= 2;
			i++;
		}
		return sum;
	}
}
