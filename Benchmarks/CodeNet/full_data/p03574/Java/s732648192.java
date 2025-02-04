import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		List<List<Character>> list = new ArrayList<>();
		//最初の列を囲う
		List<Character> zengolist = new ArrayList<>();
		for(int i = 0; i < W + 2; i++) {
			zengolist.add('.');
		}
		list.add(zengolist);
		//入力を受け付ける
		for(int i = 0; i < H; i++) {
			List<Character> clist = new ArrayList<>();
			clist.add('.');
			for(Character c : sc.next().toCharArray()) {
				clist.add(c);
			}
			clist.add('.');
			list.add(clist);
		}
		//最後の列を囲う
		list.add(zengolist);
		//判定
		List<List<Character>> anslist = new ArrayList<>(list);

		for(int i = 1; i < H + 1; i++) {
			for(int m = 1; m < W + 1; m++) {

				if(list.get(i).get(m) == '.') {
					int count = 0;
					for(int s = i - 1; s < i + 2; s++) {
						for(int t = m - 1; t < m + 2; t++) {
							if(list.get(s).get(t) == '#') {
								count++;
							}
						}
					}
					anslist.get(i).set(m, (char)('0' + count));
				}

			}
		}
		//出力
		for(int i = 1; i < H + 1; i++) {
			for(int m = 1; m < W + 1; m++) {
				System.out.print(anslist.get(i).get(m));
			}
			System.out.println();
		}
	}
}