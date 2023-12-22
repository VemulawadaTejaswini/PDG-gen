
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long s = sc.nextLong();
			long x1 = 0;
			long x2 = 0;
			long y1 = 0;
			long y2 = 0;

			long s1 = s/2;
			long s2 = s/2;
			if (s % 2 == 1) {
				s1 ++;
			}

			System.out.println("1 " + s2 + " " + s1 + " 1 0 0");

		}
	}
}
