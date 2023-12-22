import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int max = 0;
		int second = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			int current = Integer.parseInt(sc.next());
			arr[i] = current;
			if (current > max) {
				second = max;
				max = current;
			} else if (current == max) {
				second = current;
			} else if (current > second) {
				second = current;
			}
		}
		for (int i = 0; i < N; i++) {
			if (max == arr[i]) {
				System.out.println(second);
			} else {
				System.out.println(max);
			}
		}
		sc.close();
	}
}
