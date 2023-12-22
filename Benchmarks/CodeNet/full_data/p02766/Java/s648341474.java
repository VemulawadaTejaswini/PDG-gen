import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int d = 0;
		int div = N;
		while ( div > 0 ) {
			div = div / K;
			d++;
		}
		System.out.println(d);
	}
}
