import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());

		Main main = new Main();

		System.out.println(main.solve(num));
	}

	public int solve(int num) {
		if (num == 4 || num == 2 || num == 1) {
			return 4;
		}

		int con = 1;
		while (true) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = num * 3 + 1;
			}
			con++;
			if (num == 1) {
				break;
			}
		}
		return con + 1;
	}
}