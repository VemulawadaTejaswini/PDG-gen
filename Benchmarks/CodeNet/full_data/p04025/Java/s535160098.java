import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = -100; i <= 100; i++) {
			int temp = 0;
			for (int j = 0; j < N; j++) {
				temp += (a[j] - i) * (a[j] - i);
			}
			if (min > temp) {
				min = temp;
			}
		}
		System.out.println(min);
	}

}