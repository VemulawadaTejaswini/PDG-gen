import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String s = sc.next();
		final String t = sc.next();

		final String[] slist = s.split("");
		final String[] tlist = t.split("");

		List<String> slist2 = Arrays.asList(slist);
		List<String> tlist2 = Arrays.asList(tlist);

		Collections.sort(slist2);
		Collections.sort(tlist2);
		Collections.reverse(tlist2);

		if ((slist2.toString()).compareTo((tlist2.toString())) < 0) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}

		sc.close();

	}

}
