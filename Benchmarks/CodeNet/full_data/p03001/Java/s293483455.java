import java.util.Scanner;

//AtCoder Beginner Contest 130
//C	Rectangle Cutting
public class Main40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long W = sc.nextLong();
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		sc.close();

		double ans = W*H/2;

		double bx = W /2;
		double by = H /2;

		int ans2 = 0;
		if (x == bx && y == by) {
			ans2 = 1;
		}

		System.out.println(ans + " " + ans2);
	}
}
