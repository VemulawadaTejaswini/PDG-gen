import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			String s = sc.nextLine();

			for (int i = 0; i < w + 2; i++) {
				System.out.print("#");
			}
			System.out.println();
			while(sc.hasNext()) {
				System.out.print("#");
				System.out.print(sc.nextLine());
				System.out.println("#");
			}
			for (int i = 0; i < w + 2; i++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}