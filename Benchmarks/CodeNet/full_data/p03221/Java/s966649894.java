import java.util.*;
import java.util.stream.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int kenCount = sc.nextInt();
			int shiCount = sc.nextInt();
			int i = 0;
			List<Shi> list = new ArrayList<>();
			while (i < shiCount) {
				Shi shi = new Shi();
				shi.ken = sc.nextInt();
				shi.year = sc.nextInt();
				list.add(shi);
				i++;
			}

			for (Shi shi : list) {
				int ken = shi.ken;
				List<Shi> wkList = list.stream().filter(s -> s.ken == ken).sorted().collect(
						Collectors.toList());
				int num = 0;
				for (int j = 1; j < wkList.size() + 1; j++) {
					if (shi.year == wkList.get(j - 1).year) {
						num = j;
					}
				}
				shi.birthNum = num;
			}

			for (Shi shi : list) {
				System.out.println(shi.getNumberStr());
			}
		}
	}

	private static class Shi implements Comparable<Shi> {
		private int ken = 0;
		private int year = 0;
		private int birthNum = -1;

		private String getNumberStr() {
			return String.format("%06d", ken) + String.format("%06d", birthNum);
		}

		@Override
		public int compareTo(Shi o) {
			if (this.year > o.year) {
				return 1;
			}
			if (this.year < o.year) {
				return -1;
			}
			return 0;
		}
	}
}
