import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<String> ss = new ArrayList<String>();

		try {
			ss.add(sc.next());
			ss.add(sc.next());
			ss.add(sc.next());
			Collections.sort(ss);

			for (int i = 0; i < 3; i++) {
				if ((i == 0 || i == 1) && !"5".equals(ss.get(i))) {
					System.out.println("NO");
					throw new Exception();
				} else if (i == 3 && !"7".equals(ss.get(i))) {
					System.out.println("NO");
					throw new Exception();
				}
			}
			System.out.println("YES");
		} catch (Exception e) {

		} finally {
			sc.close();
		}
	}
}
