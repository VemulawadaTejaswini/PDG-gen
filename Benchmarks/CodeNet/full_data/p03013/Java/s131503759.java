import java.util.*;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Collections;


public class Main {
	static ArrayList<Integer> b_list = new ArrayList<>();
	static long patern_count = 0;
	static int max_step = 0;

	public static void check(int now_step) {
		System.out.println(now_step);
		//壊れた階段を渡った。
		if (b_list.indexOf(now_step) > -1) {
			return;
		}
		if (now_step == max_step) {
			patern_count++;
			return;
		} else if (now_step > max_step) {
			return;
		}

		check(now_step+1);
		check(now_step+2);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 整数の入力
		max_step = sc.nextInt();
		int M = sc.nextInt();

		for (int i = 0; i < M; i++) {
			b_list.add(sc.nextInt());
		}
		check(0);

		System.out.println(patern_count % 1_000_000_007);
	}
}
