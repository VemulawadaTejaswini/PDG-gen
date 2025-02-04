import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			List<String> lines = new ArrayList<String>();

			int rows = sc.nextInt();
			int cols = sc.nextInt();

			for (int i = 0; i < rows; i++) {
				lines.add(sc.next());
			}

			lines.sort((o1, o2) -> o1.compareTo(o2));

			StringBuffer sb = new StringBuffer();

			for (String str : lines) {
				sb.append(str);
			}

			System.out.println(sb.toString());
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
