import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int K = s.nextInt();

		ArrayList<String> al = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length() + 1; j++) {
				if (!al.contains((str.substring(i, j)))) {
					al.add(str.substring(i, j));
				}
			}
		}

		al.sort(Comparator.naturalOrder());

		System.out.println(al.get(K-1));

	}
}