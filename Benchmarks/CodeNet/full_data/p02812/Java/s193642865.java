import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		(new Scanner(System.in)).nextInt(); //just to skip the length
		String string = String.valueOf((new Scanner(System.in)).next());
		int count = 0;
		while(string.contains("ABC")) {
			string = string.replaceFirst("ABC","DEF");
			count += 1;
		}
		System.out.println(count);
	}
}
