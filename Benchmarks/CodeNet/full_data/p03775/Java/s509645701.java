import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = Long.MAX_VALUE;
		long N = sc.nextLong();
		int max = (int) Math.sqrt(N);
		for (int i=1;i<=max;i++) {
			if (N%i==0) {
				long y = N/i;
				long temp = String.valueOf(y).length();
				if (temp <min) {
					min = temp;
				}
			}
		}
		System.out.println(min);
	}
}