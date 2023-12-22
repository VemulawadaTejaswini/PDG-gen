import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int K = sc.nextInt();
			int S = sc.nextInt();

			int resultCnt = 0;

			for (int x = 0; x <= K; x++) {
				if (x == S) {
					resultCnt++;
				} else {
					for (int y = 0; y <= K; y++) {
						if ((x + y) == S) {
							resultCnt++;
							break;
						}
						for (int z = 0; z <= K; z++) {
							if ((x + y + z) == S) {
								resultCnt++;
								break;
							}
						}
					}
				}
			}
			System.out.println(resultCnt);
		}
	}
}
