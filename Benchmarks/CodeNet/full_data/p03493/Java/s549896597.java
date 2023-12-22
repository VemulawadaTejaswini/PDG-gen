import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve1();
	}

	private void solve1() {
		Scanner sc = new Scanner(System.in);
		int X1 = sc.nextInt();
		int X2 = sc.nextInt();
		int X3 = sc.nextInt();

		int i = 0;

		if (X1 != 1 && X1 != 0 && X1 == 1) {
			i = i++;
		}
		if (X2 != 1 && X2 != 0 && X2 == 1) {
			i = i++;
		}
		if (X3 != 1 && X3 != 0 && X3 == 1 ) {
			i = i++;
		}

		System.out.println(i);
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		String X = sc.nextLine();
		String[] TEST = X.split(" ", 0);
		int N = Integer.parseInt(TEST[0]);
		int A = Integer.parseInt(TEST[1]);
		int B = Integer.parseInt(TEST[2]);

		if (N * A <= B) {
			System.out.println(A * N);
		} else {
			System.out.println(B);
		}
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		sc.nextLine();
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();

		System.out.println(N1);
		System.out.println(N2);
		System.out.println(N3);

	}

	private void solveE() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveF() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

}