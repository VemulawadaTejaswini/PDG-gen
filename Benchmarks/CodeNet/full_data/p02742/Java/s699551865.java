import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int x = H * W / 2;
		if (H * W  % 2 != 0) {
			x++;
		}
		System.out.println(x);
	}
}