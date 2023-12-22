import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int window = sc.nextInt();
		int curtain = sc.nextInt();

		int width = window - (curtain * 2);

		if(width < 0) {
			System.out.println(0);
		}else {
			System.out.println(width);
		}
	}
}
