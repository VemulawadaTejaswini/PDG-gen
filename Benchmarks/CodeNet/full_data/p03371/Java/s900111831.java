import java.util.*;

public class Main {

	static class Pizza {
		int num;
		int money;

		Pizza(int n, int m) {
			this.num = n;
			this.money = m;
		}

		int getnum() {
			return num;
		}

		int getmoney() {
			return money;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// A B C X Y
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int A_B = A + B;

		Pizza p_B;
		Pizza p_S;

		if (X > Y) {
			p_B = new Pizza(X, A);
			p_S = new Pizza(Y, B);
		} else {
			p_S = new Pizza(X, A);
			p_B = new Pizza(Y, B);
		}

		int ans = 0;
		if (A_B > C * 2) {
			ans = C * p_S.getnum() * 2;
		} else {
			ans = A_B * p_S.getnum();
		}

		int n = p_B.getnum() - p_S.getnum();

		if (p_B.getmoney() > C * 2) {
			ans = ans + n * C * 2;
		} else {
			ans = ans + n * p_B.getmoney();
		}

		System.out.println(ans);
		sc.close();

	}
}
