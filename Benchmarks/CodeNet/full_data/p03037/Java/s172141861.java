import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();


		int maxl = 0;
		int minr = 100000;

		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			maxl = Math.max(maxl, l);
			int r = sc.nextInt();
			minr = Math.min(minr, r);
		}
		sc.close();

		System.out.println(minr-maxl+1);

	}

}
