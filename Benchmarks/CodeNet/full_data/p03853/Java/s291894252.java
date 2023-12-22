import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = Integer.parseInt(sc.next());
			sc.next();
			for (int i = 0; i < h; i++) {
				String row = sc.next();
				System.out.println(row);
				System.out.println(row);
			}
		}
	}
}
