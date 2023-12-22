import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		if(A==0) {
			System.out.println(0);
			return;
		} else if(B==0) {
			System.out.println(N);
			return;
		}

		int J = N/(A+B);
		int K = N%(A+B) >= A ? A : N%(A+B);

		int result = (J*A) + K;
		System.out.println(result);
	}
}