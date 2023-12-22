import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		String line = in.nextLine();
		List<Character> inputs = new ArrayList<>();
		for (int i = 0; i < num; ++i) {
			inputs.add(new Character(line.charAt(i)));
		}
		System.out.println(calc(inputs));
		in.close();
	}

	private static int calc(List<Character> inputs) {
		int righterChangeNum = countWestChange(inputs.subList(1, inputs.size()));
		int lefterChangeNum = 0;
		int result = lefterChangeNum + righterChangeNum;
		for (int i = 1; i < inputs.size(); ++i) {
			Character prev = inputs.get(i - 1);
			Character next = inputs.get(i);
			if (prev.equals('E') && next.equals('E')) {
				righterChangeNum--;
			} else if (prev.equals('E') && next.equals('W')) {
				// None
			} else if (prev.equals('W') && next.equals('E')) {
				lefterChangeNum++;
				righterChangeNum--;
			} else {// prev.equals('W') && next.equals('W')
				lefterChangeNum++;
			}
			result = Math.min(result, lefterChangeNum + righterChangeNum);
			// System.out.println(i + ", " + result);
		}
		// 最後

		result = Math.min(result, countEastChange(inputs.subList(0, inputs.size() - 1)));
		return result;
	}

	private static int countEastChange(List<Character> dirs) {
		int result = 0;
		for (Character dir : dirs) {
			if (dir.equals('W')) {
				result++;
			}
		}
		return result;
	}

	private static int countWestChange(List<Character> dirs) {
		int result = 0;
		for (Character dir : dirs) {
			if (dir.equals('E')) {
				result++;
			}
		}
		return result;
	}
}
