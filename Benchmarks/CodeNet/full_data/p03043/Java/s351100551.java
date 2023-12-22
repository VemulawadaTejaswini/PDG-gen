import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		double p = 0;

		for(int i=1;i<=N;i++) {
			double pi = 1;
			int temp = i;
			while(temp < K) {
				pi /= 2;
				temp *= 2;
			}
			p += pi;
		}
		p /= N;
		System.out.println(p);
    }
}