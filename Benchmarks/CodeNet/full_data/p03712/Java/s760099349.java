import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		for (int i = 0; i < W + 2; i++) {
			System.out.print("#");
		}
		for (int i = 0; i < H; i++) {
			System.out.println();
			System.out.print("#");
			System.out.print(sc.next());
			System.out.print("#");
		}
		System.out.println();
		for (int i = 0; i < W + 2; i++) {
			System.out.print("#");
		}
		sc.close();
	}
}