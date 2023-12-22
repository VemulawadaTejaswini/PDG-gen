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
			Shi[] list = new Shi[shiCount];
			Map<Integer, TreeSet<Integer>> yearMap = new HashMap<>(kenCount);
			while (i < shiCount) {
				Shi shi = new Shi();
				shi.ken = sc.nextInt();
				shi.year = sc.nextInt();
				list[i] = shi;

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

	private static class Shi {
		private int ken = 0;
		private int year = 0;
		private int birthNum = -1;

		private String getNumberStr() {
			return zero(ken) + zero(birthNum);
		}

		private String zero(int num) {
			String str = String.valueOf(num);
			switch (str.length()) {
			case 1:
				return "00000" + str;
			case 2:
				return "0000" + str;
			case 3:
				return "000" + str;
			case 4:
				return "00" + str;
			case 5:
				return "0" + str;
			case 6:
				return str;
			}
			return str;
		}
	}
}