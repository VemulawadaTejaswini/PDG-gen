import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long l = sc.nextInt();
		long r = sc.nextInt();

		long min = 2018L;
		for (long i = l; i < r; i++) {
			for (long j = l + 1; j <= l + 2018; j++) {
				long tmp = i * j % 2019;
				if (tmp < min) {
					min = tmp;
				}
			}
		}

		System.out.println(min);

		sc.close();
	}
}
