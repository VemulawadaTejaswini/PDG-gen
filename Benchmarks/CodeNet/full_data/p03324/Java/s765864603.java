import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int D = reader.nextInt();
		int N = reader.nextInt();
		int ans = 0;
		if (D == 0) {
			ans = N;
		}
		if (D == 1) {
			ans = 100 * N;
		}
		if (D == 2) {
			ans = 100 * 100 * N;
		}
		System.out.print(ans);
		reader.close();
	}
}
