import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int N = scanner.nextInt();
 		int K = scanner.nextInt();
 		double A[] = new double[N];
 		double sum = 0;
  		for (int i = 0; i < N; i++) {
  			double x = scanner.nextDouble();
  			double y = (1 + x) / 2.0;
  			A[i] = y;
  		}
  		Arrays.sort(A);

  		for (int j = N - 1; j > N - K - 1; j--) {
  			//System.out.println(A[j]);
  			sum += A[j];
  		}
  		System.out.println(sum);
 	}
}
