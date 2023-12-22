import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int monsterNum = sc.nextInt();
		int ultimate = sc.nextInt();
		List<BigDecimal> monsterList = new ArrayList<>();
		for (int i = 0; i < monsterNum; i++) {
			monsterList.add(sc.nextBigDecimal());
		}

		monsterList.sort((x, y) -> y.compareTo(x));

		BigDecimal anser = monsterList.stream()
				.skip(ultimate)
				.peek(x -> System.out.println(x))
				 .reduce((a, b) -> a.add(b)).get();
		System.out.println(anser.toString());

	}
}
