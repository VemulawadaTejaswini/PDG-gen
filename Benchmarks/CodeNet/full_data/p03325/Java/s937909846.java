import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int oddCount = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			while (a[i] % 2 == 0) {
				a[i] /= 2;
				oddCount++;
			}
		}

		System.out.println(oddCount);
	}
}
