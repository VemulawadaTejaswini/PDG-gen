import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		in.close();
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		int a = Integer.parseInt(tokens[0].substring(0, 3));
		int b = Integer.parseInt(tokens[1].substring(0, 3));
		int min = Integer.parseInt(tokens[0].substring(0, 3) + tokens[0].charAt(1) + tokens[0].charAt(0));
		int max = Integer.parseInt(tokens[1].substring(0, 3) + tokens[1].charAt(1) + tokens[1].charAt(0));
		int result = b - a + 1;
		if (A > min) {
			result -= 1;
		}
		if (B < max) {
			result -= 1;
		}
		System.out.println(result);
	}

}
