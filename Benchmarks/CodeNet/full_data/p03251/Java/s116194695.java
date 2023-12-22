import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int M = Integer.parseInt(scan.next());
		int X = Integer.parseInt(scan.next());
		int Y = Integer.parseInt(scan.next());

		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			int inputX = Integer.parseInt(scan.next());
			xList.add(inputX);
		}
		for (int i = 0; i < M; i++) {
			int inputY = Integer.parseInt(scan.next());
			yList.add(inputY);
		}
		scan.close();

		int Z = xList.get(0);
		int minY = yList.get(0);

		for (Integer x : xList) {
			if (Z < x) {
				Z = x;
			}
		}
		Z = Z + 1;

		for (Integer y : yList) {
			if (y < minY) {
				minY = y;
			}
		}

		boolean isWar = false;
		if (minY < Z) {
			isWar = true;
		}

		if (!isWar) {
			if (Z <= X) {
				isWar = true;
			} else if (Z > Y) {
				isWar = true;
			}
		}

		if (isWar) {
			System.out.print("War");
		} else {
			System.out.print("NO War");
		}
	}
}
