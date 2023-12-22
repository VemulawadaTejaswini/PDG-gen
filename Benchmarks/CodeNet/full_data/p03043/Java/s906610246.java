import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double N = in.nextDouble();
		double K = in.nextDouble();

		double y = 1;
		double sum = 0;

		for ( int i = 1; i <=N; i++ ) {

			while ( i * y < K ) {
				y *= 2;
			}
			sum += (1 / y)*(1 / N);
			y = 1.0;
		}
		System.out.println(sum);
	}
}