
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(System.in);
//		Scanner scanner = new Scanner(new File("data/hgoe.txt"));
		scanner.nextLine();
		Integer ans = 'A' - 'C';
		String input = scanner.nextLine().split(" ")[0];
		List<Integer> list = new ArrayList<>();
		char before = 0;
		char[] chararray = input.toCharArray();
		int count = 0;
		for (int i = 0; i < chararray.length - 1; i++) {
			int temp = chararray[i] - chararray[i + 1];
			if (temp == ans) {
				count++;
			}
			list.add(count);
		}
		StringBuilder sb = new StringBuilder();
		String sep = System.lineSeparator();
		while (scanner.hasNext()) {
			String[] area = scanner.nextLine().split(" ");
			int start = Integer.valueOf(area[0]) - 1;
			int end = Integer.valueOf(area[1]) - 1 - 1;
			int countl = list.get(end) - list.get(start);
			if (countl != 0) {
				countl++;
			}

			sb.append(countl);
			sb.append(sep);

		}
		System.out.println(sb.toString());
	}
}