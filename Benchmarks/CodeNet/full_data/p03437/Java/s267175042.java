import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());

		boolean flag = false;
		for (long i = x; i <= (long) Math.pow(10, 18); i += x) {
			if (i % y != 0) {
				System.out.println(i);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(-1);
		}
		sc.close();
	}
}