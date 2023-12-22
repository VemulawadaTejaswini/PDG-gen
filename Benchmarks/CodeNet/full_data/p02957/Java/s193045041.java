import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String ans;
		int sub = Math.abs(a - b);

		if (sub % 2 != 0)
			ans = "IMPOSSIBLE";
		else
			ans = Integer.toString(sub / 2 + Math.min(a, b));

		System.out.println(ans);

		sc.close();
	}

}
