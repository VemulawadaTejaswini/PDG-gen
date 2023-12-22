import java.util.*;

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
			Map<Integer, TreeSet<Integer>> yearMap = new HashMap<>();
			while (i < shiCount) {
				Shi shi = new Shi();
				shi.ken = sc.nextInt();
				shi.year = sc.nextInt();
				list.add(shi);

				TreeSet<Integer> yearList = yearMap.get(shi.ken);
				if (yearList == null) {
					yearList = new TreeSet<>();
					yearMap.put(shi.ken, yearList);
				}
				yearList.add(shi.year);
				i++;
			}
			for (Shi shi : list) {
				int ken = shi.ken;
				TreeSet<Integer> yearList = yearMap.get(ken);
				shi.birthNum = yearList.headSet(shi.year).size() + 1;
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
