import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] x = new double[N];
		String[] u = new String[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextDouble();
			u[i] = sc.next();
		}
		sc.close();
		double a = 0;
		for(int i = 0; i < N; i++) {
			if(u[i].equals("JPY")) {
				a += x[i];
			}else {
				a += 380000.0 * x[i];
			}
		}
		System.out.printf("%.1f", a);

	}
}