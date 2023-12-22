import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; (i * 4) <= N; i++) {
			for (int j = 0; (j * 7) + (i * 4) <= N; j++) {
				if ((j * 7) + (i * 4) == N) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}