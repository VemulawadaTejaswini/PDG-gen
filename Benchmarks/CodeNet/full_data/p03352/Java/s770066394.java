import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		int ans = 1;
		for (int i = 2; i <= X; i++) {
			for (int j = 2; j <= X; j++) {
				double pow = Math.pow(i, j);
				if (pow <= X) {
					ans = (int) pow;
				}
			}
		}
		System.out.println(ans);
	}
}
