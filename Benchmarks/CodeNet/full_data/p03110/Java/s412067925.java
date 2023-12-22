import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double x[] = new double[N];
		String u[] = new String[N];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextDouble();
			u[i] = sc.next();
		}

		double sum = 0;

		for (int i = 0; i < N; i++) {
			if (u[i].equals("JPY")) {
				sum += x[i];
			} else {
				sum += 380000.0* x[i];
			}
		}
		BigDecimal ans = new BigDecimal(Double.toString(sum));
		ans = ans.setScale(4,RoundingMode.HALF_UP);
		System.out.println(ans);
	}
}
