import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int d = sc.nextInt();

			int ans = 0;
			if (n % (2*d+1) != 0) {
				ans = (n / (2*d+1)) + 1;
			} else {
				ans = n / (2*d+1);
			}
			System.out.println(ans);
	}

}