import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] ary = new String[H];

		for (int i = 0; i < H; i++) {
			ary[i] = sc.next();
		}
		if (H == 1) {
			for (int i = 0; i < 2; i++) {
				System.out.println(ary[0]);
			}
		} else {
			for (int i = 0; i < H * 2; i++) {
				System.out.println(ary[i / 2]);
			}
		}

	}
}