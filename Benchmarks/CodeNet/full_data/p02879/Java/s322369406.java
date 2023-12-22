import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		String[] str = n.split(" ");

		int n1 = Integer.parseInt(str[0]);
		int n2 = Integer.parseInt(str[1]);
		if (n1 > 9 || n2 > 9) {
			System.out.println("-1");
		} else {
			System.out.println(n1 * n2);
		}
	}
}