public class Main {
	public static void main(String[] args) {

		final int N = new java.util.Scanner(System.in).nextInt();
		double x = N / 1.08;

		int initialNum = (int) x;

		boolean flg = false;

		for (int i = -1; i < 2; i++) {
			initialNum += i;
			int counter = 1;
			double d;

			while (true) {
				d = initialNum + 1.08 * counter;
				if (d < N) {
					counter++;
					continue;
				}
				break;
			}
			int a = (int) d - N;
			if(a == 0) {
				flg = flg || true;
				break;
			}

		}

		if (flg) {
			System.out.println(initialNum + 1);
		} else {
			System.out.println(":(");
		}

	}
}
