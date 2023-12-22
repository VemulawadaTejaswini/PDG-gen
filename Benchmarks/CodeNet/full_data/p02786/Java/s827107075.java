import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String l1 = scan.nextLine();
		scan.close();

		long h = Long.valueOf(l1);

		if (h <= 1) {
			System.out.println(h);
			return;
		}

		List<Long> monsters = new ArrayList<Long>();
		monsters.add(h);

		long result = 0;

		while (true) {
			boolean process = false;
			List<Long> buf = new ArrayList<Long>();

			for (long monster : monsters) {

				if (!process) {
					// モンスターの体力が1なら、そのモンスターの体力は0になる
					if (monster == 1) {
						result++;
						process = true;
					}

					// モンスターの体力がX>1なら、そのモンスターは消滅し、
					// 体力が⌊X/2⌋のモンスターが新たに2体現れる
					if (monster > 1) {
						long halfMonster = (long) Math.floor(monster / 2.0);
						buf.add(halfMonster);
						buf.add(halfMonster);
						result++;
						process = true;
					}
				} else {
					buf.add(monster);
				}
			}
			monsters = buf;
			process = false;

			if (monsters.size() == 0) {
				break;
			}

		}

		System.out.println(result);
	}
}
