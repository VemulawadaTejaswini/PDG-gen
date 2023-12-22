import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        int X = sc.nextInt();
        int a = sc.nextInt();
        int ans = X-a;

        if (ans < 0) {
            ans = 0;
        }

        System.out.println(ans);

		sc.close();
	}
}
