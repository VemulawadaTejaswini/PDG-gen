mport java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (a == 2 || b == 2) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
