import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(1);
			}

			for (int j = 0; j < w - a; j++) {
				System.out.print(0);
			}

			System.out.println();
		}

		for (int i = 0; i < h - b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(0);
			}

			for (int j = 0; j < w - a; j++) {
				System.out.print(1);
			}
			System.out.println();
		}
	}
}