import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveC();
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

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] rates = new int[9];
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int index = a / 400;
			rates[index > 8 ? 8 : index]++;
		}
		int min = 0;
		for (int j = 0; j < 8; j++) {
			if (rates[j] > 0) {
				min++;
			}
		}
		int max = min + rates[8];
		if (max > 9) {
			max = 9;
		}
		if (rates[8] > 0 && min == 0) {
			min = 1;
		}
		System.out.println(min + " " + max);
	}
}