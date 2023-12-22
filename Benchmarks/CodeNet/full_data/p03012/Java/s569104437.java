import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		int min = 0;
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
			min += array[i];
		}

		int T = 0;
		int t = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				T += array[j];
			}
			for (int k = i; k < N; k++) {
				t += array[k];
			}
			int abs = Math.abs(T - t);
			if (abs < min) {
				min = abs;
			}
			t=0;
			T=0;
		}
		System.out.println(min);
	}

}