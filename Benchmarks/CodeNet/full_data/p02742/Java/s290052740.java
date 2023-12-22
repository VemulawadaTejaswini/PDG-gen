import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			long h = sc.nextInt();
			long w = sc.nextInt();

			long ido = 0;

			if ((h * w) % 2 == 0) {
				ido = (h * w) / 2;
			} else {
				ido = ((h * w) / 2) + 1;
			}

			System.out.println(ido);
		} finally {
			sc.close();
		}
	}
}
