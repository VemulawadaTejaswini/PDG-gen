import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = A + B;
		long D = N / C;
		long E=N-D*C;
		long ans=D*A+E;

		System.out.println(ans);

	}
}