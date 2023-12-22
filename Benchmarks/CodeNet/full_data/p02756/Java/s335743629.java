import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	String str = sca.next();
	List<String> list = new ArrayList<>();

	for(int i = 0; i < str.length(); i++) {
		list.add(String.valueOf(str.charAt(i)));
	}
	int q = sca.nextInt();
	int ti = -1;
	int fi = -1;
	String ci = null;

	for(int i = 0; i < q; i++) {
		ti = sca.nextInt();
		if(ti == 1) {
			Collections.reverse(list);
		}
		else if(ti == 2) {
			fi = sca.nextInt();
			ci = sca.next();
			if(fi == 1) {
				list.add(0, ci);
			}
			else if(fi == 2) {
				list.add(ci);
			}
		}
	}

	// Ti = 1のときstrを反転
	// Ti = 2のときFi = 1のとき先頭に文字Ciを加える。
	// Ti = 2のときFi = 2のとき末尾に文字Ciを加える。

	for(String str_ans : list) {
		System.out.print(str_ans);
	}
	System.out.println("");

	// 後始末
	sca.close();
	}
}