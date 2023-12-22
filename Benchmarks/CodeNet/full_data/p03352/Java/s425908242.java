import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 1;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			int j = 2;
			int m = (int) Math.pow(i, j);
			while (m <= n) {
				m = (int) Math.pow(i, j);
				if (max < m && m <= n) max = m;
				j++;
			}
		}

		System.out.println(max);

		sc.close();
	}

}
