import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		List<String> list = new ArrayList<String>();
		int anyCount = 0;
		
		for (int i = 0; i < N; i++) {
			int rate = sc.nextInt();
			String color = getColor(rate);
			if (color == "any") {
				anyCount++;
			} else {
				list.add(color);
			}
		}
		
		// listの重複を削除する
		Set<String> set = new HashSet<String>(list);
		List<String> list2 = new ArrayList<String>(set);
		
		// anyしかない場合は、最小値は1、最大値はanyの数
		// any以外の色が1つ以上ある場合は、
		// 最小値は、list2の要素数（anyがすべて、list2に含まれる色だった場合）
		// 最大値は、list2の要素数 + anyの数（anyがすべて異なる色だった場合）
		int min, max;
		if (list.size() == 0) {
			min = 1;
			max = anyCount;
		} else {
			min = list2.size();
			max = min + anyCount;
		}
		
		System.out.println(min + " " + max);
	}
	
	public static String getColor(int rate) {
		if (rate <= 399) {
			return "gray";
		} else if (rate >= 400 && rate <= 799) {
			return "brown";
		} else if (rate >= 800 && rate <= 1199) {
			return "green";
		} else if (rate >= 1200 && rate <= 1599) {
			return "sky";
		} else if (rate >= 1600 && rate <= 1999) {
			return "blue";
		} else if (rate >= 2000 && rate <= 2399) {
			return "yellow";
		} else if (rate >= 2400 && rate <= 2799) {
			return "orange";
		} else if (rate >= 2800 && rate <= 3199) {
			return "red";
		} else {
			return "any";
		}
	}	
}
