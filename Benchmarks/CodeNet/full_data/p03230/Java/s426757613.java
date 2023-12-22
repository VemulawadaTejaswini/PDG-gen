import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		if (N == 1) {
			System.out.println("Yes");
			System.out.println(2);
			System.out.println("1 1");
			System.out.println("1 1");
		} else if (N == 2) {
			System.out.println("Yes");
			System.out.println(2);
			System.out.println("2 1 2");
			System.out.println("2 1 2");
		} else if (N == 3) {
			System.out.println("Yes");
			System.out.println(3);
			System.out.println("2 1 2");
			System.out.println("2 1 3");
			System.out.println("2 2 3");
		} else {
			System.out.println("No");
		}
	}

}
