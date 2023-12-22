import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		int H = a.nextInt();
		int W = a.nextInt();
int h = a.nextInt();
		int w = a.nextInt();
		int ans = (H - h) * (W - w);
		System.out.println(ans);

	}

}
