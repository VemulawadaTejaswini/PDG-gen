import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		if (line.length() == 2) {
			System.out.println(line);
		} else {
			for (int i = 0; i < 3; ++i) {
				System.out.print(line.charAt(2 - i));
			}
			System.out.println("");
		}
		in.close();
	}
}
