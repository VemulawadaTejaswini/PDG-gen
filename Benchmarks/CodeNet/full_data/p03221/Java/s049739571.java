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
			// Map<Integer, TreeSet<Integer>> yearMap = new HashMap<>();
			while (i < shiCount) {
				Shi shi = new Shi();
				shi.idx = i;
				shi.ken = sc.nextInt();
				shi.year = sc.nextInt();
				list[i] = shi;
				i++;
			}

			Arrays.sort(list, (o1, o2) -> {
				if (o1.ken == o2.ken) {
					return o1.year - o2.year;
				}
				return o1.ken - o2.ken;
			});

			int[] seq = new int[kenCount + 1];
			String[] ans = new String[shiCount];
			for (int j = 0; j < shiCount; j++) {
				seq[list[j].ken]++;
				list[j].birthNum = seq[list[j].ken];
				ans[list[j].idx] = list[j].getNumberStr();
			}

			for (String a : ans) {
				System.out.println(a);
			}
		}
	}

	private static class Shi {
		private int idx = -1;
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
