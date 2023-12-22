import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int n1 = Integer.parseInt(str);
		for (int i = 1; i <10; i++) {
			if (n1 % i == 0 & n1 / i < 10) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");

	}

}
