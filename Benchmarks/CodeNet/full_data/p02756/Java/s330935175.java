import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	String str = sca.next();
	List<String> list = new ArrayList<>();
	List<String> list_left = new ArrayList<>();
	List<String> list_right = new ArrayList<>();


	for(int i = 0; i < str.length(); i++) {
		list.add(String.valueOf(str.charAt(i)));
	}
	int q = sca.nextInt();
	int ti = -1;
	int fi = -1;
	String ci = null;
	int right_left = 0;  // 0:左,1:右

	for(int i = 0; i < q; i++) {
		ti = sca.nextInt();
		if(ti == 1) {
			if(right_left == 0) {
				right_left = 1;
			}
			else {
				right_left = 0;
			}
		}
		else if(ti == 2) {
			fi = sca.nextInt();
			ci = sca.next();
			if(fi == 1 && right_left == 0) {
				list_left.add(0, ci);
			}
			else if(fi == 1 && right_left == 1) {
				list_right.add(ci);
			}
			else if(fi == 2 && right_left == 0) {
				list_right.add(ci);
			}
			else if(fi == 2 && right_left == 1) {
				list_left.add(0, ci);
			}
		}
	}
	int index = 0;
	for(String str_left : list_left) {
		list.add(index, str_left);
		index++;
	}
	for(String str_right : list_right) {
		list.add(str_right);
		index++;
	}
	if(right_left == 1) {
		Collections.reverse(list);
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