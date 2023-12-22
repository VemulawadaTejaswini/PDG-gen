import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans;

		if (a < 6)
			ans = 0;
		else if (a >= 6 && a <= 12)
			ans = b / 2;
		else
			ans = b;
		System.out.println(ans);
	}
}
