import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String s = sc.next();

			int idx = s.indexOf("A");
			int lstIdx = s.lastIndexOf("Z");

			System.out.println(lstIdx - idx + 1);

		} finally {
			sc.close();
		}
	}
}