import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		double T = sc.nextInt() + 0.5;

		int total = 0;
		int n = 1;
		while(A < T) {

			A *= n;
			n++;
			total += B;
		}

		System.out.println(total);


	}
}