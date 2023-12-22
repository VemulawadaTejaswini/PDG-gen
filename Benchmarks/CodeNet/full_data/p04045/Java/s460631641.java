import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	private static List<Integer> acceptableDigits = Arrays.stream(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}).collect(ArrayList::new, List::add, List::addAll);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strPrice = scanner.nextLine().split(" ")[0];
		List<Integer> dislikes = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());
		acceptableDigits.removeAll(dislikes);

		List<Integer> pDigits = new ArrayList<>();
		pDigits.add(0);
		pDigits.addAll(Arrays.stream(strPrice.split("")).map(Integer::parseInt).collect(Collectors.toList()));

		if (!isAcceptable(pDigits, dislikes)) {
			for (int i = 0; i < pDigits.size(); i++) {
				if (dislikes.contains(pDigits.get(i))) {
					increment(pDigits, i);
					break;
				}
			}
		}

		if (pDigits.get(0) == null) pDigits.remove(0);
		System.out.println(Integer.parseInt(pDigits.stream().map(i -> Integer.toString(i)).reduce((s1, s2) -> s1 + s2).orElse("0")));
	}

	private static boolean isAcceptable(List<Integer> pDigits, List<Integer> dislikes) {
		return pDigits.stream().anyMatch(dislikes::contains);
	}

	private static void increment(List<Integer> pDigits, int index) {
		for (int i = index + 1; i < pDigits.size(); i++) {
			pDigits.set(i, acceptableDigits.get(0));
		}

		Integer previousDigit;
		do {
			previousDigit = pDigits.get(index);
			pDigits.set(index, getNextClosestAcceptableDigit(previousDigit));
		} while (pDigits.get(index--) < previousDigit);
	}

	private static Integer getNextClosestAcceptableDigit(Integer digit) {
		if (acceptableDigits.get(acceptableDigits.size() - 1) <= digit) return acceptableDigits.get(0);
		for (Integer acceptableDigit : acceptableDigits) {
			if (acceptableDigit > digit) return acceptableDigit;
		}
		return null;
	}
}
