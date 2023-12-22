import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		for (int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		boolean[] isPrimeNum = new boolean[100001];
		for (int i = 1; i <= 100000; i += 2) {
			isPrimeNum[i] = true;
		}
		for (int i = 2; i <= 100000; i += 2) {
			isPrimeNum[i] = false;
		}
		isPrimeNum[0] = false;
		isPrimeNum[1] = false;
		isPrimeNum[2] = true;
		for (int i = 3; i <= 100000; i += 2) {
			for (int j = 3; j * j <= i; j += 2) {
				if (i % j == 0) {
					isPrimeNum[i] = false;
				}
			}
		}

//		for (int i = 1; i <= 10; i ++) {
//			System.out.println(i + " " + isPrimeNum[i]);
//		}

		for (int i = 0; i < q; i++) {
			int cnt = 0;
			for (int j = l[i]; j <= r[i]; j++) {
				if (isPrimeNum[j] && isPrimeNum[(j + 1) / 2]) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}

	}

}
