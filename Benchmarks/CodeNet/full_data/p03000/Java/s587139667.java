import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		int c = 1;
		int D = 0;
		for (int i = 0; i < N; i++) {
			int L = sc.nextInt();
			D += L;
			if (D > X)
				break;
			c++;
		}

		System.out.println(c);
	}
}