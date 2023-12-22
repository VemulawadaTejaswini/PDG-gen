import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		if (add >= sub && add >= mul) {
			System.out.println(add);
		} else if (sub >= mul) {
			System.out.println(sub);
		} else {
			System.out.println(mul);
		}
	}

}
