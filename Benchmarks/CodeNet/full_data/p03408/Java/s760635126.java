import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		List<String> aList = new ArrayList<String>();

		IntStream.range(0, a).forEachOrdered(i -> aList.add(sc.next()));

		int b = sc.nextInt();
		List<String> bList = new ArrayList<String>();
		IntStream.range(0, b).forEachOrdered(i -> bList.add(sc.next()));
		String c = sc.next();

		int col = 0;
		for (String target : aList) {
			col += (target.equals(c)) ? 1 : 0;
		}

		for (String target : bList) {
			col += (target.equals(c)) ? -1 : 0;
		}

		col = (col <= 0) ? 0 : col;

		System.out.println(col);
	}
}