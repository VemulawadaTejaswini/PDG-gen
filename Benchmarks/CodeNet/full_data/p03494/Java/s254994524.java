import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int[] array = new int[N];
			for (int i = 0; i < N; i++) {
				array[i] = scanner.nextInt();
			}

			System.out.println(returnActionCnt(array,0));
		}
	}

	private static int returnActionCnt(int[] array,int  cnt) {
		boolean flg = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				flg = false;
				return cnt;
			}
		}
		// すべてが偶数だったとき
		if (flg) {
			for (int i = 0; i < array.length; i++) {
				array[i] /= 2;
			}
			cnt++;
		}

		return returnActionCnt(array, cnt);
	}
}