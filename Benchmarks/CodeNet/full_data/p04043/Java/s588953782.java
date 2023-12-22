import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int first = sc.nextInt();
			int second = sc.nextInt();
			int third = sc.nextInt();

			int pro = first * second * third;
			if (pro / 5 / 7 / 5 == 1) {
				System.out.println("YES");
			} else {
				throw new Exception();
			}
		} catch (Throwable t) {
			System.out.println("NO");
		} finally {
			sc.close();
		}
	}

}
