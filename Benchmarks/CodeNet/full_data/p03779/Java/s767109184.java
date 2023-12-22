import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = Integer.parseInt(sc.next());

		for (long t = 0; t <= x; t++) {
			if (t * (t - 1) / 2 < x && t * (t + 1) / 2 >= x) {
				System.out.println(t);
			}
		}

		sc.close();
	}
}