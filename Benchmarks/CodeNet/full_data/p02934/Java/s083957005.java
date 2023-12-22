import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		double[] in = new double[N];
		double sum = 0;
		
		for (int i = 0; i < N; i++) {
			in[i] = Double.parseDouble(sc.next());
			sum += 1 / in[i];
		}
		
		System.out.println(1 / sum);
	}
}
