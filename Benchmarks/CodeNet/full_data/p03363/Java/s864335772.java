import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}

		long cnt = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				long sum = 0;
				for (int k = i; k <= j; k++) {
					sum += a[k];
				}
				if (sum == 0)
					cnt++;
			}
		}

		System.out.println(cnt);
		sc.close();
	}

}
