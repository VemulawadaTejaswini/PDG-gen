import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = 0;

		if (x == 0) a = 1;
		else if (x == 1) a = 100;
		else a = 10000;

		System.out.println(a * y);
	}
}