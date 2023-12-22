import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int num = scan.nextInt();

		for(int i = 0; i < num; i++) {
			list.add(scan.nextInt());
		}

		// それぞれの手札を計算
		int sumAlice = list.stream().sorted(Comparator.reverseOrder()).mapToInt(x->x).filter(i -> i % 2 == 0).sum();
		int sumBob   = list.stream().sorted(Comparator.reverseOrder()).mapToInt(x->x).filter(i -> i % 2 == 1).sum();

		System.out.println(sumAlice - sumBob);
		scan.close();

	}

}