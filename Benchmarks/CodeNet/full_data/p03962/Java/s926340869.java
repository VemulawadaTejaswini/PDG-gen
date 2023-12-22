import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a == b && a == c)
			System.out.println(1);
		else if ((a == b && a != c) || (a == c && a != b) || (b == c && a != b))
			System.out.println(2);
		else
			System.out.println(3);
		sc.close();
	}
}