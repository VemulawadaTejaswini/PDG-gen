import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	static int[] costMasuList;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			String[] inputTmp = scanner.nextLine().split(" ");
			int masuLength = Integer.parseInt(inputTmp[0]);
			// int costMasuLength = Integer.parseInt(inputTmp[1]);
			int startMasu = Integer.parseInt(inputTmp[2]);
			String[] costMasuListTmp = scanner.nextLine().split(" ");
			costMasuList = Stream.of(costMasuListTmp).mapToInt(Integer::parseInt).toArray();

			int startLeftCost = 0;
			int startRightCost = 0;
			for (int i = 1; i < masuLength; i++) {
				if (!isCostMasu(i)) {
					continue;
				}
				if (i < startMasu) {
					startLeftCost++;
				} else if (i > startMasu) {
					startRightCost++;
				}
			}

			System.out.print(startLeftCost < startRightCost ? startLeftCost : startRightCost);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	private static boolean isCostMasu(int input) {
		for (int i = 0; i < costMasuList.length; i++) {
			if (costMasuList[i] == input) {
				return true;
			}
		}
		return false;
	}
}
