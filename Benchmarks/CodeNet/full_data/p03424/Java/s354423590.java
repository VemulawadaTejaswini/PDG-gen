import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String args[]) {

		try (Scanner sc = new Scanner(System.in)) {

			sc.nextInt();
			sc.nextLine();

			String[] s = sc.nextLine().split(" ");

			Set<String> set = new HashSet<>(Arrays.asList(s));

			System.out.println(set.size() == 3 ? "Three" : "Four");

		}

	}

}
