import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		LOOP1 : while (true) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 1) {
					break LOOP1;
				}
				a[i] = a[i] / 2;
			}
			cnt++;
		}

		System.out.println(cnt);
	}

}