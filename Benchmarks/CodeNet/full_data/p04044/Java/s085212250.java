import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//値の入力
		int N = sc.nextInt();
		int L = sc.nextInt();
		List<String> S = new ArrayList<String>();
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			if(s.length() == L) {
				S.add(s);
			}else {
				i--;
			}
		}
		//辞書順にソート
		S.sort(Comparator.naturalOrder());
		//出力
		for (String s : S) {
			System.out.print(s);
		}

	}

}
