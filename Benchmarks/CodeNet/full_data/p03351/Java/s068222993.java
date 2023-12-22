import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			String result;

			if (Math.abs(a - c) <= d) {
				result = "Yes";
			} else if (Math.abs(a - b) <= d & Math.abs(b -c) <= d) {
				result = "Yes";
			} else {
				result = "No";
			}
			System.out.println(result);
	}
}