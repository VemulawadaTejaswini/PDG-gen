import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int material = scanner.nextInt();

			// input
			int[] integers = new int[N];
			for (int i = 0; i < N; i++) {
				integers[i] = scanner.nextInt();
			}
			// 最小材料数で何個作成できるか算出する
			int cnt = returnCreatableCount(material - Arrays.stream(integers).sum(), integers);
			System.out.println(N + cnt);
		}
	}

	private static int returnCreatableCount(int nokori, int[] integers) {
		Arrays.sort(integers);
		return nokori / integers[0];
	}
}