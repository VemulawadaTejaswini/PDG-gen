import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int cnt = 0;
		while (B > 0) {
			if (cnt == 0) {
				B = B - A;
				cnt++;
			} else {
				B = B - A - 1;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
