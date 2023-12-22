

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = Integer.parseInt(sc.nextLine());

		List<String> dic = new ArrayList<>();

		String term = "";

		for(int i = 0; i < s.length(); i++){
			String sub = s.substring(i);
			for(int j = 1; j < sub.length() + 1; j++){
				term = sub.substring(0, j);
				if(!dic.contains(term)) dic.add(term);
				}
		}

		Collections.sort(dic);
		System.out.println(dic.get(k-1));
	}

}
