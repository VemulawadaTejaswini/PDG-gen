import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int monsterNum = sc.nextInt();
		int ultimate = sc.nextInt();
		List<Integer> monsterList = new ArrayList<>();
		for (int i = 0; i < monsterNum; i++) {
			monsterList.add(sc.nextInt());
		}

		monsterList.sort((x, y) -> y.compareTo(x));

		int anser = monsterList.stream()
				.skip(ultimate)
				.mapToInt(x -> x)
				.sum();
		System.out.println(anser);

	}
}
