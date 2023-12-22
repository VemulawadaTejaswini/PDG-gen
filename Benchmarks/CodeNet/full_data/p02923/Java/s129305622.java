import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		int max = 0;
		int a = 0;

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}

		for (int i = 1; i < N; i++) {
			if (H[i - 1] >= H[i]) {
				a++;
				if (a > max) {
					max = a;
				}
			} else {
				a = 0;
			}
		}
		sc.close();
		System.out.println(max);
	}
}
