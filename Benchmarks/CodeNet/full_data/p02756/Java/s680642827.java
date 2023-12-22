import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	String str = sca.next();
	int q = sca.nextInt();
	int[] ti = new int[q];
	int[] fi = new int[q];
	String[] ci = new String[q];
	for(int i = 0; i < q; i++) {
		ci[i] = null;
		ti[i] = sca.nextInt();
		if(ti[i]  == 1) {

		}
		else if(ti[i]  == 2) {
			fi[i] = sca.nextInt();
			ci[i] = sca.next();
		}
	}
	List<String> list = new ArrayList<>();
	list.add(str);


	// Ti = 1のときstrを反転
	// Ti = 2のときFi = 1のとき先頭に文字Ciを加える。
	// Ti = 2のときFi = 2のとき末尾に文字Ciを加える。
	for(int i = 0; i < q; i++) {
		if(ti[i] == 1) {
			Collections.reverse(list);
		}
		else if(ti[i] == 2) {
			if(fi[i] == 1) {
				list.add(0, ci[i]);
			}
			else if(fi[i] == 2) {
				list.add(ci[i]);
			}
		}
	}

	int size =  list.size();
	for(int index = 0; index < size; index++) {
		System.out.print(list.get(index));
	}
	System.out.println("");

	// 後始末
	sca.close();
	}
}