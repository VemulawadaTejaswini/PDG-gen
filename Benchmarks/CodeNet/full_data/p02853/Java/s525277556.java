import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int res = 0;
		if (X == 1) {
			res += 300000;
		} else if (X == 2) {
			res += 200000;
		} else if (X == 3) {
			res += 100000;
		}
		if (Y == 1) {
			res += 300000;
		} else if (X == 2) {
			res += 200000;
		} else if (X == 3) {
			res += 100000;
		}
		if (X == 1 && Y == 1) {
			res += 400000;
		}
		System.out.print(res);
	}
}
