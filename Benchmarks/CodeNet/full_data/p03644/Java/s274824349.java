import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxNum = 1;
		int count = 0;
		for (int i = 0; i < N; i++) {
			int targetNum = i + 1;
			int tmpCount = 0;
			while (targetNum % 2 == 0) {
				targetNum = targetNum / 2;
				tmpCount++;
			}
			if (tmpCount > count) {
				count = tmpCount;
				maxNum = i + 1;
			}
		}
		System.out.println(maxNum);
		sc.close();
	}
}