import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int all = a + b;
		int wari = n / all;
		int amari = n % all;
		int hasuu = a > amari ? amari : a;
		System.out.println(wari + hasuu);

		sc.close();
	}

}
