import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.next());
		ArrayList<Integer> heightList = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			heightList.add(Integer.parseInt(sc.next()));
		}

		ArrayList<Integer> results = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			results.add(nextCountResult(heightList, 0));
			heightList.remove(0);
		}

		System.out.println(results.stream().max(Integer::compare).orElse(0));

	}

	public static int nextCountResult(ArrayList<Integer> heightList, int step) {
		if (heightList.size() -1 == step) {
			return step;
		}

		if (0 <= heightList.get(step) - heightList.get(step+1)) {
			step += 1;
			return nextCountResult(heightList, step);
		}

		return step;
	}
}
