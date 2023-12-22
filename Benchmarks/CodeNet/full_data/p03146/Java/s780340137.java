import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();

		Scanner sc = new Scanner(System.in);
		main.solve(sc);
		sc.close();
	}

	void solve(Scanner sc) {
		int s = sc.nextInt();
		boolean preEnd = false;
		int i = 1;
		while (true) {
			i++;
			if (s % 2 == 0) {
				s = s / 2;
				if (s == 4) {
					if (preEnd) {
						break;
					}
					preEnd = true;
				}
			} else {
				s = s * 3 + 1;
				if (s == 4) {
					if (preEnd) {
						break;
					}
					preEnd = true;
				}
			}
		}
		System.out.println(i);

	}
}
