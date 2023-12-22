import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<String> list = new ArrayList<>();

		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		//入力終了
		sc.close();

		//重複なしの配列を作ることで候補者リストを作成
		List<String> list2 = new ArrayList<String>(new HashSet<>(list));
		//カウントを記録する配列
		int cnt[] = new int[list2.size()];
		//リストを辞書的に昇順ソート
		Collections.sort(list2);
		//リストを参考に票数をカウント
		int max=0;
		for(int i=0;i<list2.size();i++) {
			for(int j=0;j<n;j++) {
				if(list2.get(i).equals(list.get(j))) {
					cnt[i] += 1;
					if(max < cnt[i]) max = cnt[i];
				}
			}
		}

		//最大値と同じも票数のがあればそれを出力する。
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i] == max) System.out.println(list2.get(i));
		}

	}


}