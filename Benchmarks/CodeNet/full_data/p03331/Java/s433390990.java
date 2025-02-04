import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = 100001;

		for (int A = 2; A < N; A++) {
			int B = N - A;
			int tmp = calSumOfDigits(A) + calSumOfDigits(B);

			if(tmp < min) {
				min = tmp;
			}
		}
		System.out.println(min);
	}
	//各桁の和を計算
	public static int calSumOfDigits(int n) {
		int sum = 0;
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
