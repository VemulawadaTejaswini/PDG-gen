import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		List<Integer> monsters = new ArrayList<>();
		while (scanner.hasNextInt()) {
			monsters.add(scanner.nextInt());
		}

		Collections.sort(monsters);
		int min = monsters.get(0);

		while (true) {
			int pos = -1;
			for (int i = 1; i < monsters.size(); i++) {
				if (monsters.get(i) % min != 0
						&& monsters.get(i) % min < min) {
					min = monsters.get(i) % min;
					pos = i;
				}
			}
			if (pos != -1) {
				monsters.set(pos, min);
				Collections.sort(monsters);
			} else {
				break;
			}
		}

		System.out.println(min);
	}
}