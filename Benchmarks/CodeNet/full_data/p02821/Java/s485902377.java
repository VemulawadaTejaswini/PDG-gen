import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			long n = sc.nextLong();
			long m = sc.nextLong();
			List<Long> an = new ArrayList<>();
			for (long i = 0; i < n; i++) {
				an.add(sc.nextLong());
			}
			// 降順ソート
			Collections.sort(an, Comparator.reverseOrder());
			List<Long> scoreList = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					scoreList.add(an.get(i) + an.get(j));
				}
			}
			Collections.sort(scoreList, Comparator.reverseOrder());
			long score = 0;
			for (int i = 0; i < m; i++) {
				score = score + scoreList.get(i);
			}
			System.out.println(score);
		}
	}
}
