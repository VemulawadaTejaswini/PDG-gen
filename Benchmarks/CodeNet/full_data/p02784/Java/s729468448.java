import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int waza[] = new int[N];
		int Swaza = 0;
		for (int i = 0; i < N; i++) {
			Swaza += sc.nextInt();
		}

		if (H <= Swaza) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
