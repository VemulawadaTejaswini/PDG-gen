import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();

		Integer[] aList = new Integer[M];
		for (int i = 0; i < M; i++) {
			int a = scan.nextInt();
			aList[i] = a;
		}

		int wDay = 0;
		for (int i = 0; i < aList.length; i++) {
			wDay = wDay + aList[i];
		}

		if (N < wDay) {
			System.out.println("-1");
		} else {
			System.out.println(N - wDay);
		}

	}
}
