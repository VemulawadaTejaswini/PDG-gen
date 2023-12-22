import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int maxValue = 0;
			int maxIndex = 0;
			for (int i = 1; i <= N;i++) {
				int ans = returnEvenCnt(i, 0);
				if (maxValue <= ans) {
					maxIndex = i;
					maxValue = ans;
				}
			}
			System.out.println(maxIndex);
		}
	}

	private static int returnEvenCnt(int n, int evenCnt) {
		if (n % 2 == 1){
			return evenCnt;
		}
		n /= 2;
		evenCnt++;
		return returnEvenCnt(n, evenCnt);
	}
}