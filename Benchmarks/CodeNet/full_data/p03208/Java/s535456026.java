
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//		ABC115_A();
		//		ABC115_B();
		ABC115_C();
		// ABC115_D();
	}

	private static void ABC115_A() {
		Scanner scanner = null;
		int date = 0;

		try {
			scanner = new Scanner(System.in);
			date = scanner.nextInt();

			switch (date) {
			case 22:
				System.out.println("Christmas Eve Eve Eve");
				break;
			case 23:
				System.out.println("Christmas Eve Eve");
				break;
			case 24:
				System.out.println("Christmas Eve");
				break;
			case 25:
				System.out.println("Christmas");
				break;
			default:
				System.out.println("fail!");
				break;
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC115_B() {
		Scanner scanner = null;
		int numItem = 0;
		int priceItem = 0;

		try {
			scanner = new Scanner(System.in);
			numItem = scanner.nextInt();
			int[] priceArray = new int[numItem];

			for (int i = 0; i < numItem; i++) {
				priceArray[i] = scanner.nextInt();
			}

			Arrays.sort(priceArray);

			int prices = 0;
			for (int i = 0; i < priceArray.length; i++) {
				if (i != numItem - 1) {
					prices += priceArray[i];
				} else {
					prices += priceArray[i] / 2;
				}

			}

			System.out.println(prices);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
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
			int minDiff = 100000000;
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

	public static class Res {
		private int start;

		public void setStart(int start) {
			this.start = start;
		}

		public void setEnd(int end) {
			this.end = end;
		}

		private int end;
		int[] heightList;

		public Res(int s, int e, int[] heightList) {
			this.start = s;
			this.end = e;
			this.heightList = heightList;
		}

		public int getStart() {
			return start;
		}

		public int getEnd() {
			return end;
		}

		public int getSabun() {
			return heightList[end] - heightList[start];
		}
	}

	private static Res getMaxSabunNo(int[] sabunList, Res resint, int selectedTreeNum) {
		int maxSabun = 0;
		int maxSabunNo = resint.getStart();
		for (int i = resint.getStart(); i < resint.getEnd(); i++) {
			if (maxSabun < sabunList[i]) {
				maxSabun = sabunList[i];
				maxSabunNo = i;

			}
		}
		if (maxSabunNo + 1 >= selectedTreeNum) {
			resint.setEnd(maxSabunNo);
			resint = getMaxSabunNo(sabunList, resint, selectedTreeNum);
		} else if (sabunList.length - maxSabunNo >= selectedTreeNum) {
			resint.setStart(maxSabunNo);
			resint = getMaxSabunNo(sabunList, resint, selectedTreeNum);
		} else {
			resint.setEnd(maxSabunNo);
		}

		return resint;
	}

	private static void ABC115_D() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}