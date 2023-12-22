import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		in.close();
		if (B % A == 0) {
			System.out.println((A + B));
		} else {
			System.out.println((B - A));
		}
	}

}
