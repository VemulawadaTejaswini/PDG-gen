import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt() - 1;
		System.out.println(getLunlun(k));
	}

	static long getLunlun(int k) {
		ArrayList<Long> lunluns = new ArrayList<Long>();
		for (long i = 1; i <= 9; ++i) {
			lunluns.add(i);
		}

		int lunlunIndex = 0;
		while (k >= lunluns.size()) {
			long lunlun = lunluns.get(lunlunIndex);
			long lowestDigit = lunlun % 10;
			for (long toAppended = lowestDigit - 1; toAppended <= lowestDigit + 1; ++toAppended) {
				if (0 <= toAppended && toAppended <= 9) {
					long newLunlun = lunlun * 10 + toAppended;
					lunluns.add(newLunlun);
				}
			}
			++lunlunIndex;
		}
		return lunluns.get(k);
	}

}
