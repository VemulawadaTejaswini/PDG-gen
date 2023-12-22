import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String ans;
		if (a % 2 != b % 2)
			ans = "IMPOSSIBLE";
		else
			ans = Integer.toString((a + b) / 2);

		System.out.println(ans);

		sc.close();
	}

}
