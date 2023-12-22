import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L[] = new int[N];
		int max = 0;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
			sum += L[i];
			if (L[i] > max) {
				max = L[i];
			}
		}
		sc.close();
		sum = sum - max;
		if (sum - max < 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
