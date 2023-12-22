package src0915;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class A0915 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int x = scan.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			list.add(scan.nextInt());
		}
		
		scan.close();
		
		Collections.sort(list);
		
		int cnt = 0;
		
		try {
			while (x - list.get(cnt) >= 0) {
				x = x - list.get(cnt);
				cnt++;
			} 
		} catch (IndexOutOfBoundsException e) {
		}
		
		System.out.println(cnt);
		
		
		

	}

}
