import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		int ans = p + q + r - Math.max(p, Math.max(q, r));

		System.out.println(ans);

		sc.close();
	}

}
