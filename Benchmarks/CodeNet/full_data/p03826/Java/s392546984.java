import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r1 = sc.nextInt() * sc.nextInt();
		int r2 = sc.nextInt() * sc.nextInt();

		int ans = r1 > r2 ? r1 : r2;

		System.out.println(ans);

		sc.close();
	}

}
