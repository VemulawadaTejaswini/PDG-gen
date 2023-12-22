import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if ((h == 1 || w == 1)) {
				System.out.println(1);
				return;
			}
			if (h % 2 == 0) {
				System.out.println((h / 2 * w));
				return;
			}
			if (w % 2 == 0) {
				System.out.println((w / 2 * h));
				return;
			}
			//System.out.println((((h - 1) / 2 * w) + (w / 2 + 1)));
		}
	}
}