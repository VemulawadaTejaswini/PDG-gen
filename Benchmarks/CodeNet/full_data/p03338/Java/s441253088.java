import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		String line = in.nextLine();
		List<Character> input = new ArrayList<>();
		for (int i = 0; i < num; ++i) {
			input.add(new Character(line.charAt(i)));
		}

		System.out.println(calc(input));

		in.close();

	}

	public static int calc(List<Character> input) {
		Set<Character> chars = new HashSet<>();
		chars.addAll(Arrays.asList(input.stream().distinct().toArray(Character[]::new)));
		int result = Integer.MIN_VALUE;
		for (int i = 1; i < input.size(); ++i) {
			int count = count(input.subList(0, i), input.subList(i, input.size()));
			if (count > result) {
				result = count;
			}
		}
		return result;
	}

	public static int count(List<Character> first, List<Character> last) {
		Set<Character> firstChars = new HashSet<>();
		firstChars.addAll(first);
		Set<Character> lastChars = new HashSet<>();
		lastChars.addAll(last);
		int result = 0;
		for (Character c : firstChars) {
			if (last.contains(c)) {
				result++;
			}
		}
		return result;
	}

}