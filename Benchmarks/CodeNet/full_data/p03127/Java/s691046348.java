import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 118
//C	Monsters Battle Royale
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<Integer> inList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
				inList.add(sc.nextInt());
		}
		sc.close();

		int min = 0;
		int minIndex = 0;

		while (inList.size() > 1) {
			min = Collections.min(inList);
			minIndex = getMinIndex(inList, min);
			if (min == 1) {
				break;
			}
			for (int i = 0; i < inList.size(); i++) {
				if (i == minIndex) {
					continue;
				} else {
					inList.set(i, inList.get(i) % min);
				}
			}
			for (int i = inList.size() - 1; i >= 0; i--) {
				if (inList.get(i) == 0) {
					inList.remove(i);
				}
			}
		}

		System.out.println(min);
	}

	private static int getMinIndex(List<Integer> inList, int min) {
		for (int i = 0; i < inList.size(); i++) {
			if (inList.get(i) == min) {
				return i;
			}
		}
		return -1;
	}
}
