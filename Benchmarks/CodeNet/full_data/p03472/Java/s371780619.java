package atCoderBeginnerContest085;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//入力を取得します
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
	
		
		List<Integer> s = new ArrayList<>();
		for (int i = 0 ; i < n; i++) {
		  int sin1 = sc.nextInt();
		  s.add(sin1);
		  int sin2 = sc.nextInt();
		  s.add(sin2);
		}
		sc.close();
		
	
		//計算部分

		int count = 0;
		int cmax = 0;
		int c = 0;
	
		while (h > 0) {
		    for (int i = 0 ; i < s.size(); i++) {
			    if (s.get(i) > cmax) {
				    c = i;
				    cmax = s.get(i);
			    }
		    }
	
		    h -= cmax;
		    count++;
		    cmax = 0;

		    if (c%2 == 1) {
			    s.set(c, 0);
		    }
		}
	
		//回答を表示します
		System.out.println(count);
		
	}

}
