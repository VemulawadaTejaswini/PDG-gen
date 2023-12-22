
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//		ABC115_A();
		//		ABC115_B();
		ABC115_C();
		// ABC115_D();
	}


	private static void ABC115_C() {
		Scanner scanner = null;
		int totalTreeNum = 0;
		int selectedTreeNum = 0;

		try {
			scanner = new Scanner(System.in);
			totalTreeNum = scanner.nextInt();
			selectedTreeNum = scanner.nextInt();

			int[] treeTehightList = new int[totalTreeNum];

			for (int i = 0; i < totalTreeNum; i++) {
				treeTehightList[i] = scanner.nextInt();
			}

			Arrays.sort(treeTehightList);

			//			int[] sabunList = new int[treeTehightList.length - 1];

			//			for (int i = 0; i < sabunList.length; i++) {
			//				sabunList[i] = treeTehightList[i + 1] - treeTehightList[i];
			//			}
			int minDiff = Integer.MAX_VALUE;
			for (int i = 0; i < treeTehightList.length - (selectedTreeNum - 1); i++) {
				if (minDiff > treeTehightList[i + selectedTreeNum - 1] - treeTehightList[i]) {
					minDiff = treeTehightList[i + selectedTreeNum - 1] - treeTehightList[i];
				}

			}
			System.out.println(minDiff);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}