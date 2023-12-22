
import java.util.Scanner;

// *** at 2018/**/**

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveB();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (n < k) {
			System.out.println(n * x);
		} else {
			System.out.println((k * x) + ((n - k) * y));
		}
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine();
		char s;
		int a = 0;
		for (int i = 0; i < w.length(); i++) {
			s = w.charAt(i);
			a = rep(w, s);
			if (a % 2 == 1) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	private int rep(String str, char target) {
		return str.length() - str.replace(target + "", "").length();
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