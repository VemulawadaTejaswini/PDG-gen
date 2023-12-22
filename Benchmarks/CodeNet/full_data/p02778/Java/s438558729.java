import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			String result = "";
			for (int i = 0; i < s.length(); i++) {
				result += "x";
			}
			System.out.println(result);
		}
	}

}
