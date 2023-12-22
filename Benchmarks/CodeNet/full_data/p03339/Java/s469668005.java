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
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < inputs.size(); ++i) {
			int changeNum = countEastChange(inputs.subList(0, i)) + countWestChange(inputs.subList(i+1, inputs.size()));
			if (result > changeNum) {
				result = changeNum;
			}
		}
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