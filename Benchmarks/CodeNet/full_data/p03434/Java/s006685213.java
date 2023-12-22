import java.util.ArrayList;
import java.util.Collections;
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

		int sumAlice = 0;
		int sumBob   = 0;

		// カードを降順に並べ替え
		Collections.sort(list, Comparator.reverseOrder());


		// カードを交互に配る
		for(int i = 0; i < list.size(); i++) {
			if(i % 2 == 0)
				sumAlice += list.get(i);
			else
				sumBob   += list.get(i);
		}

		System.out.println(sumAlice - sumBob);
		scan.close();

	}

}