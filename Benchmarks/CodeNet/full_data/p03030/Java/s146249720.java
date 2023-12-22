import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Guide> guids = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			Guide g = new Guide();
			g.place = sc.next();
			g.score = sc.nextInt();
			g.index = i + 1;
			guids.add(g);
		}

		sc.close();

		guids.sort((g1 , g2) -> {
			int order = g1.place.compareTo(g2.place);

			if (order != 0) {
				 return order;
			} else {
				return Integer.compare(g2.score, g1.score);
			}
		});

		for (Guide guide : guids) {
//			System.out.println(guide.place);
//			System.out.println(guide.score);
			System.out.println(guide.index);
//			System.out.println();
		}
		// System.out.println(ans);
	}

	private static class Guide {
		String place;
		int score;
		int index;
	}

}
