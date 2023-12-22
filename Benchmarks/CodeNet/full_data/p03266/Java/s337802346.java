import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int n = 0;
		int result = 0;

		n = N / K;
		result = n * n * n;

		if(K % 2 == 0) {
			n += 1;
			result += n * n * n;
		}

		System.out.println(result);

		return;
	}
}
