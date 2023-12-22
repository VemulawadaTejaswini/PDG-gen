import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ansT = 1;
		long ansA = 1;
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int a = sc.nextInt();

			long mt = (long) Math.ceil(ansT / (double) t);
			long ma = (long) Math.ceil(ansA / (double) a);
			long m = Math.max(mt, ma);

			ansT = m * t;
			ansA = m * a;
		}
		sc.close();

		System.out.println(ansT + ansA);
	}
}
