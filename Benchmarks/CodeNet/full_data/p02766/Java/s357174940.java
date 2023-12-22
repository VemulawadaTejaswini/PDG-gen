import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		while (N / K != 0) {
			count++;
			N = N / K;
		}
		System.out.println(count + 1);

	}
}
