import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		String S;
		try(Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			S = sc.next();
		}
		char[] s = S.toCharArray();
		
		//2こ目と3こ目が一致してるかどうかを使いまわす
		//2こめ、3こめが一致してないものとその距離を配列に持って1こめとの距離で計算？
		
		// 最初2つが異なるもののリスト
		List<Triple> list = new ArrayList<>();
		// 起点
		for(int i = 0; i < n; i++) {
			// 2番目
			for(int j = i + 1; j < n; j++) {
				if(s[i] == s[j]) {
					continue;
				}
				Triple triple = new Triple();
				triple.i = i;
				triple.j = j;
				list.add(triple);
			}
		}
		
		int count = 0;
		// 後ろから順に
		OUTER:
		for(int i = n - 1; i > 1; i--) {
			for(Triple triple: list) {
				if(triple.j >= i) {
					continue;
				}
				if(triple.j - triple.i == i - triple.j) {
					continue;
				}
				if(s[i] == s[triple.i] || s[i] == s[triple.j]) {
					continue;
				}
				count++;
			}
		}
		
		System.out.println(count);
	}

}

class Triple {
	int i;
	int j;
}
