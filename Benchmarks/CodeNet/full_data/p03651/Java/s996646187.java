import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		// 前提条件
		String[] line = sc.nextLine().split(" ");
		int NUMBER_OF_BALL = Integer.parseInt(line[0]);
		Integer TARGET = new Integer(line[1]);
		
		// ボール
		List<Integer> list = new ArrayList<Integer>();
		line = sc.nextLine().split(" ");
		for(String s: line){
			list.add(Integer.parseInt(s));
		}
		if (list.contains(TARGET)) {
			System.out.println("POSSIBLE");
			return;
		}
		Collections.sort(list);
		int num1;
		int num2;
		int num3;
		for(int i = 0; i < list.size() - 1; i++) {
			num1 = list.get(i);
			for(int j = i+1; j < list.size(); j++) {
				num2 = list.get(j);
				num3 = num1+num2;
				//nu//num1+num2);
				if(TARGET == num3) {
					System.out.println("POSSIBLE");
					return;
				}else if (num3 > TARGET){
					break;
				}else {
					list.add(num3);
					Collections.sort(list);
				}
			}
		}
		System.out.println("IMPOSSIBLE");
		return;
	}
}
