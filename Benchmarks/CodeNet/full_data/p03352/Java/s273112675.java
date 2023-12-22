import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int i;

		for (i = 1; i * i <= a; i++);
		System.out.println((int)Math.pow(i-1, 2));
	}
}