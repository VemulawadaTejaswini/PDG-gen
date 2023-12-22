import java.util.Scanner;

public class Main {

	static int anser = 0;
	static int width = 0;
	static int height = 0;
	static int a = 0;
	static int b = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		height = scan.nextInt();
		width = scan.nextInt();
		a = scan.nextInt();
		b = scan.nextInt();

		search(0, 0);

		System.out.println(anser);

	}

	private static void search(int right, int down) {

		if (right == width - 1 && down == height - 1) {

			if(anser == Math.pow(10, 9)+6) {
				anser = 0;
			}
			anser++;
		}

		if (isValid(right,down)) {
			search(right +1, down);
			search(right, down+1);
		}

	}

	private static boolean isValid(int right,int down) {

		if (right < b && down >= height - a) {
			return false;
		}
		if (right >= width) {
			return false;
		}
		if (down >= height) {
			return false;
		}
		return true;

	}

}
