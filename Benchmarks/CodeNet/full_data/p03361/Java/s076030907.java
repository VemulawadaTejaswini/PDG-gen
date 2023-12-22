import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		List<String> rows = new ArrayList<>();
		while (sc.hasNext()) {
			rows.add(sc.nextLine());
		}
		sc.close();

		boolean a = true;
		boolean b = true;
		for (int i = 0 ; i < h ; i++) {
			String row = rows.get(i);
			if (row.contains(".#.") || row.substring(0, 2).equals("#.") || row.substring(w - 2).equals(".#")) {
				a = false;
			}
		}

		for (int i = 0 ; i < w ; i++) {
			String c = "";
			for (int k = 0 ; k < h ; k++) {
				c = c + rows.get(k).substring(i, i+1);
			}
			if (c.contains(".#.") || c.substring(0, 2).equals("#.") || c.substring(w-2).equals(".#")) {
				b = false;
			}
		}
		if (a || b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
