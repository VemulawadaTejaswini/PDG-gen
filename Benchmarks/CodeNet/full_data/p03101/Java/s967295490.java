import java.util.Scanner;

public class WhiteCells {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		if (h >= 0) {
			H = H - h;
		}
		if (w >= 0) {
			W = W - w;
		}
		System.out.println(H * W);

	}

}
