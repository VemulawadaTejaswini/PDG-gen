import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n1, n2, n4, n5, t, cnt = 0;
		for (int i = a; i <= b; i++) {
			t = i;
			n1 = t % 10;
			t = t / 10;
			n2 = t % 10;
			t = t / 100;
			n4 = t % 10;
			t = t / 10;
			n5 = t % 10;
			if (n1 == n5 && n2 == n4) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}
