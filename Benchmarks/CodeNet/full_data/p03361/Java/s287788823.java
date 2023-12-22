import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] hw = scanner.nextLine().split(" ");
		int height = Integer.parseInt(hw[0]);
		int width = Integer.parseInt(hw[1]);
		char[][] cellSts = new char[height + 2][width + 2];

		for (int wIdx = 1; wIdx <= width; wIdx++) cellSts[0][wIdx] = cellSts[height + 1][wIdx] = '.';
		for (int hIdx = 1; hIdx <= height; hIdx++) cellSts[hIdx] = ('.' + scanner.nextLine() + '.').toCharArray();

		boolean isPaintable = true;
LOOP:	for (int hIdx = 1; hIdx <= height; hIdx++) {
			for (int wIdx = 1; wIdx <= width; wIdx++) {
				if (cellSts[hIdx][wIdx]     == '#' &&
					cellSts[hIdx - 1][wIdx] == '.' &&
					cellSts[hIdx][wIdx - 1] == '.' &&
					cellSts[hIdx + 1][wIdx] == '.' &&
					cellSts[hIdx][wIdx + 1] == '.') {
					isPaintable = false;
					break LOOP;
				}
			}
		}

		if (isPaintable) System.out.println("Yes");
		else System.out.println("No");
	}
}
