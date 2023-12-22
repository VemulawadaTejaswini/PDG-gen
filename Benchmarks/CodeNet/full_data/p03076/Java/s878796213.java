import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList();
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		int clock = 0;
		int margin = 0;
		for (int i = 0; i < 5; i++) {
			int max = -1;
			int index1 = -1;
			int index2 = 0;
			int num = 0;
			int num2 = 0;
			for (int j = 0; j < 5; j++) {
				if (i == j || list.get(i) < 0 || list.get(j) < 0) {
					continue;
				} else {
					num = list.get(i) + list.get(j);
					num %= 10;
					if (max <= num) {
						max = num;
						index1 = i;
						index2 = j;
						num2 = num;
					}
				}
			}
			if (index1 < 0 || index2 < 0 || index1 == index2) {
				break;
			}
			clock += list.get(index1);
			int num3;
			if ((num3 = (list.get(index1) % 10 + list.get(index2) % 10)) >= 10) {
				clock += 10 - (num3 % 10);
			}
			clock += list.get(index2);
			int tmp = clock % 10;
			if (tmp > 0) {
				margin += 10 - tmp;
			}
			if (margin >= 10) {
				clock += margin;
				clock += 10 - clock % 10;
				if (margin % 10 == 0) {
					clock -= 10;
				}
				margin = 0;
			}
			list.set(index1, -1);
			list.set(index2, -1);
		}
		
		int max = Collections.max(list);
		margin += max % 10;
		if (margin > 0) {
			clock += margin;
			if (margin % 10 == 0) {
				clock -= 10;
			}
		}
		margin = 0;
		
		if (max > 0) {
			int tmp = clock % 10;
			if (tmp > 0) {
				clock += 10 - tmp;
				if (tmp % 10 == 0) {
					clock -= 10;
				}
			}
			clock += max;
		}
		
		System.out.println(clock);
	}
}
