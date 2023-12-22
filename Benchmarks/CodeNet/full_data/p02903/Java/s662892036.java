import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (i < b) System.out.print(j < a ? 0 : 1);
					else if (i >= b) System.out.print(j < a ? 1 : 0);
				}
				System.out.println();
			}
		}
	}
}