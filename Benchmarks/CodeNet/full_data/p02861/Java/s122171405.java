import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r\n");
		int N = sc.nextInt();
		String zahyo;
		double x[] = new double[N];
		double y[] = new double[N];
		double sum = 0;

		for (int i = 0; i < N; i++) {
			zahyo = sc.next();
			x[i] = Integer.valueOf(zahyo.split(" ")[0]);
			y[i] = Integer.valueOf(zahyo.split(" ")[1]);
		}

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				sum += Math.sqrt((Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2)));
			}
		}

		System.out.println(2 * sum / N);

	}
}
