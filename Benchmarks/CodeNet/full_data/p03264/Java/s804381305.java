import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int ans = k / 2;
		if (ans % 2 == 0) {
			System.out.println(ans * ans);
		} else {
			System.out.println((int)Math.ceil((double)k/2) * ans);
		}
	}
}