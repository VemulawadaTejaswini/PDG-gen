import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] bingo = new int[9];
		boolean[] bingoMap = new boolean[9];
		String ans = "No";
		int row0_3_6,row1_4_7,row2_5_8,col0_1_2,col3_4_5,col6_7_8,dia0_4_8,dia2_4_6;
		row0_3_6 = row1_4_7 = row2_5_8 = col0_1_2 = col3_4_5 = col6_7_8 = dia0_4_8 = dia2_4_6 = 0;
		for (int i = 0; i < 9; i+= 3) {
			int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
			System.arraycopy(line, 0, bingo, i, 3);
		}
		int items =Integer.parseInt(sc.nextLine());
		for (int i = 0; i < items; i++) {
			int target = Integer.parseInt(sc.nextLine());
			for (int j = 0; j < 9; j++) {
				if (bingo[j] == target) {
					bingoMap[j] = true;
					break;
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			boolean isPanched = bingoMap[i];
			if (isPanched) {
				switch(i) {
					case 0:
						row0_3_6++;
						col0_1_2++;
						dia0_4_8++;
						break;
					case 1:
						row1_4_7++;
						col0_1_2++;
						break;
					case 2:
						row2_5_8++;
						col0_1_2++;
						dia2_4_6++;
						break;
					case 3:
						row0_3_6++;
						col3_4_5++;
						break;
					case 4:
						row1_4_7++;
						col3_4_5++;
						dia0_4_8++;
						dia2_4_6++;
						break;
					case 5:
						row2_5_8++;
						col3_4_5++;
						break;
					case 6:
						row0_3_6++;
						col6_7_8++;
						dia2_4_6++;
						break;
					case 7:
						row1_4_7++;
						col6_7_8++;
						break;
					case 8:
						row2_5_8++;
						col6_7_8++;
						dia0_4_8++;
						break;
				}

				if (row0_3_6 == 3 || row1_4_7 == 3 || row2_5_8 == 3 || col0_1_2 == 3 || col3_4_5 == 3 || col6_7_8 == 3 || dia0_4_8 == 3 || dia2_4_6 == 3 ) {
					ans = "Yes";
					break;
				}

			}
		}

		System.out.println(ans);


	}

}
