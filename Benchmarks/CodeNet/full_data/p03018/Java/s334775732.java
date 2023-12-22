import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			String str = s.next();

			int ret = 0;
			while (str.indexOf("ABC") >= 0) {
				ret++;
				str = str.replaceFirst("ABC", "BCA");
			}
			System.out.println(ret);
		}
	}
}
