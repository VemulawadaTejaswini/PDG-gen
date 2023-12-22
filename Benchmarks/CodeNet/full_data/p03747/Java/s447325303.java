import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveC();
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int T = sc.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt() + T * (3 - sc.nextInt() * 2);
		}
		boolean isOK = false;
		while (!isOK) {
			isOK = true;
			for (int i = 1; i < N; i++) {
				if (array[i - 1] > array[i]) {
					int swap = array[i];
					array[i] = array[i - 1];
					array[i - 1] = swap;
					isOK = false;
				}
			}
			if (array[N - 1] - L > array[0]) {
				int swap = array[0];
				array[0] = array[N - 1] - L;
				array[N - 1] = swap + L;
				isOK = false;
			}
		}
		for (int x : array) {
			System.out.println((x + L) % L);
		}
	}
}