import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a[] = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			int tmp = a[i];
			if(tmp > max) {
				max = tmp;
				continue;
			}
			if(tmp < min) {
				min = tmp;
				continue;
			}
		}
		System.out.println(max - min);
	}

}
