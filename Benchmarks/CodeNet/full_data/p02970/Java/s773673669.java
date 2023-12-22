import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();

		int range = 2 * D + 1;

		int ans = N / range;
		if (N % range != 0) {
			ans ++;
		}
		System.out.println(ans);
	}


}