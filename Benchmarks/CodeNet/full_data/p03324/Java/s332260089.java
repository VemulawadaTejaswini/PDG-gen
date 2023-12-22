import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long D = sc.nextLong();
		long N = sc.nextLong();
		long ans =0;
		if (N == 100) {
			if (D == 0) {
				System.out.println(101);
			}else if (D == 1) {
				System.out.println(10100);
			}else if (D == 2) {
				System.out.println(1010000);
			}
		} else {
			ans = (long)Math.pow(100, D) * N;
			System.out.println(ans);
		}


	}
}
