import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int cnt = 0;
		if (N >= 100000) {
			cnt = 90909;
		} else if (N >= 10000) {
			cnt = N - 9999 + 909;
		} else if (N >= 1000) {
			cnt = 909;
		} else if (N >= 100) {
			cnt = N - 99 + 9;
		} else if (N >= 10) {
			cnt = 9;
		} else if (N >= 0) {
			cnt = N;
		}
		System.out.println(cnt);

	}
}