import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.nextLine().split(" ")[0]);

		List<StringBuilder> outputList = new ArrayList<StringBuilder>();
		String inputLine;
		for (int i = 1; i <= h; i++) {
			inputLine = sc.nextLine();
			if (inputLine.indexOf("#") == -1) {
				continue;
			}
			outputList.add(new StringBuilder(inputLine));
		}
		StringBuilder firstLine = new StringBuilder(outputList.get(0));
		int lastIndex = firstLine.lastIndexOf(".");
		long listSize = outputList.size();
		while (lastIndex >= 0) {
			final int targetIndex = lastIndex;
			if (outputList.stream().filter(e -> (e.charAt(targetIndex) == '.')).count() == listSize) {
				outputList.forEach(e -> e.deleteCharAt(targetIndex));
			}

			firstLine.deleteCharAt(targetIndex);
			lastIndex = firstLine.lastIndexOf(".");
		}

		outputList.forEach(e -> System.out.println(e));

		sc.close();
	}
}