import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int D = stdIn.nextInt();
		double[][] X = new double[N][D];
		int a, b, count = 0;
		double sum = 0;
		
		for(a = 0; a < N; a++) {
			for(b = 0; b < D; b++) {
				sum += (X[a][b] + X[a + 1][b]) * (X[a][b] + X[a + 1][b]);
				sum = Math.sqrt(sum);
				if(sum % 1 == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
		stdIn.close();		
	}
}