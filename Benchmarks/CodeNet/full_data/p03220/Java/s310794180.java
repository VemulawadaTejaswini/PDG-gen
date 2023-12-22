
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		double T = sc.nextDouble();
		double A = sc.nextDouble();
		double tem = A;
		long ans = 0;
		for(long i = 1; i < N + 1; i++) {
			double H = sc.nextDouble();
			double tmp = T - H * 0.006;
			if(tem > Math.abs(A - tmp)) {
				tem = Math.abs(A - tmp);
				ans = i;
			}
		}
		System.out.println(ans);

	}

}
