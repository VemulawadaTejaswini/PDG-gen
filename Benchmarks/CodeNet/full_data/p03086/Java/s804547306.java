import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		String a = "A";
		String t = "T";
		String c = "C";
		String g = "G";
		List<String> list = Arrays.asList(a, t, c, g);

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		int maxS = 0;
		int maxE = 0;
		int maxlength = 0;
		int lentgh = input.length();
		// 探索
		for (int i = 0; i < lentgh; i++) {
			for (int j = i; j < lentgh; j++) {
				String temp = input.substring(i, j);

				List<String> strings = Arrays.asList(temp.toCharArray()).stream().map(String::new)
						.collect(Collectors.toList());

				if (list.containsAll(strings) && strings.size() >= maxlength) {
					maxlength = strings.size();
				}
			}
		}
		System.out.println(maxlength);
	}
}
