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
			// Shi[] list = new Shi[shiCount];
			List<Shi> list = new ArrayList<>(shiCount);
			while (i < shiCount) {
				Shi shi = new Shi();
				shi.idx = i;
				shi.ken = sc.nextInt();
				shi.year = sc.nextInt();
				list.add(shi);
				i++;
			}
			Collections.sort(list, (o1, o2) -> {
				if (o1.ken == o2.ken) {
					return o1.year - o2.year;
				}
				return o1.ken - o2.ken;
			});

			String[] answers = new String[shiCount];

			List<Integer> seqList = new ArrayList<>(kenCount);
			for (Shi shi : list) {
				int ken = shi.ken;
				seqList.set(ken, seqList.get(ken) + 1);
				shi.birthNum = seqList.get(ken);
				answers[shi.idx] = shi.getNumberStr();
			}

			for (String ans : answers) {
				System.out.println(ans);
			}
		}
	}

	private static class Shi {
		private int idx = 0;
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