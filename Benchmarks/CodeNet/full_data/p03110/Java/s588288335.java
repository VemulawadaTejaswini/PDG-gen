import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double rate = 380_000.0;
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			String u = sc.next();
			if (u.equals("JPY")){
				sum += x;
			} else {
				sum += x * rate;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
