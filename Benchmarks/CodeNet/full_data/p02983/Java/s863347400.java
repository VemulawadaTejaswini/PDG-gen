import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L, R, min;
		L = sc.nextInt();
		R = sc.nextInt();
		sc.close();
		R = Math.min(R, L + 4038);
		min = 2018;
		for (int i = L; i < R; i++) {
			for (int j = i + 1; i <= R; i++) {
				int a = i * j % 2019;
				if (min > a) {
					min = a;
				}
			}
		}
		System.out.println(min);
	}
}
