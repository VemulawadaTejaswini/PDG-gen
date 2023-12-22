import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ans = 0;
		for (int i = 0; i < n + 1; i++) {
			if ((int) Math.floor(i * 1.08) == n) {
				ans = i;
			}
		}
		if (ans != 0) {
			System.out.println(ans);
		} else {
			System.out.println(":(");
		}
	}

}
