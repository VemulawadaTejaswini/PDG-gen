import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] x = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = scan.nextInt();
			sum += (Math.min(K - x[i], x[i]) * 2);
		}
		System.out.println(sum);
		scan.close();

	}

}
