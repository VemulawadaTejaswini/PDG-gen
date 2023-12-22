import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int cnt = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j <= N; j++) {
				if (j <= N && j < Math.pow(10,(2*i+1)) && j >= Math.pow(10,(2*i))) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
