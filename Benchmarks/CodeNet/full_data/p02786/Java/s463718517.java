import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			long h = sc.nextLong();

			long cnt = 1;
			while (cnt <= h) {
				cnt *= 2;
			}

			System.out.println(cnt - 1);
		}
	}
}
