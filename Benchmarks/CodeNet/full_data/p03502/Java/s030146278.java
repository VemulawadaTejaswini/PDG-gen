import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int sum = N % 10;
		
		for (int i = 1; i < String.valueOf(N).length(); i++) {
			sum += N / Math.pow(10, i);
		}
		
		if (N % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}