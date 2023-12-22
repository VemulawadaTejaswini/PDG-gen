import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveB();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((g * 10 + b) % 4 == 0 ? "YES" : "NO");
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = 1000;
		int max = 0;
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (min > a) {
				min = a;
			}
			if (max < a) {
				max = a;
			}
		}
		System.out.println(max - min);
	}
}