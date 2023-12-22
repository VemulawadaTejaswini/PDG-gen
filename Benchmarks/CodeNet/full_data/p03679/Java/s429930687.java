
import java.util.Scanner;

//internous_atcoder_001 at 2018/02/15

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveA065();
	}

	private void solveA081() {
		Scanner sc = new Scanner(System.in);
		char N[] = sc.nextLine().toCharArray();
		int cnt = 0;
		for (char c : N) cnt += c - '0';
		System.out.println(cnt);
	}

	private void solveA065() {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (B - A <= 0) {
			System.out.println("delicious");
		} else if (X < B - A) {
			System.out.println("dangerous");
		} else {
			System.out.println("safe");
		}
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N);
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