import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		scanner.nextLine();
		List<Integer> alList = new ArrayList<>();
		for (int i = 1; i <= M; i++) {
			alList.add(i);
		}

		while (scanner.hasNextLine()) {
			String string = scanner.nextLine();
			List<Integer> kIntegers = new ArrayList<>();
			String[] s = string.split(" ");
			for (int i = 0; i < s.length; i++) {
				kIntegers.add(Integer.parseInt(s[i]));
			}

			alList.removeAll(kIntegers);
		}

		System.out.println(alList.size());
	}
}