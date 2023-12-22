import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		//Long[] anser = new Long[N];
		List<Long> list = new ArrayList<>();
		List<Long> anser = new ArrayList<>();
		for(int i = 0; i < N ; i++) {
			list.add(sc.nextLong());
		}

		//重複しているものを追加しない、自動ソート済み
		TreeSet<Long> TS = new TreeSet<>(list);
		if(list.size() == TS.size()) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}