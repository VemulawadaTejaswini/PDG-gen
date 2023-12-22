import java.util.Scanner;

class Main {

	private static int a,b;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();

		int ret = 0;
		ret += pressButton();
		ret += pressButton();

		System.out.println(ret);
	}

	private static int pressButton() {
		if(a>b) {
			a--;
			return a+1;
		}else {
			b--;
			return b+1;
		}
	}

}
