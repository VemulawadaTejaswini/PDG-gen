import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if ((a - c) <= d || ((a - b) <= d && (a - b) <= d))
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}