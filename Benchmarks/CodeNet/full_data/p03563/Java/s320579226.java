import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int ans = G - R;
		if (ans > 0)
			ans = ans * 2 + R;
		System.out.println(ans);
		sc.close();
	}
}