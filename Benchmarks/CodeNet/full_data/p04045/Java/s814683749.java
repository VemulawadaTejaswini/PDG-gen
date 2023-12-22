import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int price = sc.nextInt();
			int size = sc.nextInt();

			List<Character> dislike = new ArrayList<Character>();

			for (int i = 0; i < size; i++) {
				dislike.add(sc.next().charAt(0));
			}

			for (int i = price; i < 10000; i++) {
				boolean contains = false;
				for (char c : Integer.toString(i).toCharArray()) {
					if (dislike.contains(c)) {
						contains = true;
						break;
					}
				}
				if (!contains) {
					System.out.println(i);
					break;
				}
			}
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
