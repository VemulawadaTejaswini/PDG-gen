import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), Y = sc.nextInt();
		sc.close();
		System.out.print(X + Y / 2);
	}
}