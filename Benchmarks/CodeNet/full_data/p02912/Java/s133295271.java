import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int numN = scan.nextInt();
		int numM = scan.nextInt();

		List<Integer> cost = new ArrayList<>();

		for (int i = 0; i < numN; i++) {
			cost.add(scan.nextInt());
		}

		Collections.sort(cost, Collections.reverseOrder());

		loop: for (int i = 0; i < numM; i++) {

			int temp = cost.get(0) / 2;
			cost.remove(0);

			for (int j = 0; j < numM - 1; j++) {
				if (temp > cost.get(j)) {
					cost.add(j, temp);
					continue loop;
				}
			}
			cost.add(numM - 1, temp);
		}
		long sum = 0L;
		for (int i : cost) {
			sum += i;
		}

		System.out.println(sum);
	}
}