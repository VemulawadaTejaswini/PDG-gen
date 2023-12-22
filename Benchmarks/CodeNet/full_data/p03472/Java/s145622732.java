import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//入力を取得します
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();

		
		List<Integer> s1 = new ArrayList<>(n);
		List<Integer> s2 = new ArrayList<>(n);
		for (int i = 0 ; i < n; i++) {
		  int sin1 = sc.nextInt();
		  int sin2 = sc.nextInt();
		  s1.add(sin1);
		  s2.add(sin2);
		}
		sc.close();
		
	
		//計算部分

		int count = 0;
		int nl = n-1;
		int c = 0;
		
		Collections.sort(s1);
		Collections.sort(s2);
		int s1a = s1.get(nl);
		
		check :
		for (int i = 0 ; s2.get(nl - i) > s1a ; i ++) {
	        h -= s2.get(nl - i);
	        count++;
	        
	        if (h <= 0) {
	            break check;
	        } 
	        
	        if (nl - i == 0) {
	        	    count = count + h/s1a + 1;
	        	    break check;
			}
	        
	        c = nl - i;
		}
	        
	    if (c != 0 && s2.get(c - 1) <= s1a) {
		 count = count + h/s1a;
	    }
	
		
		message(count);
	}
	
		private static void exit() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

		//回答を表示するメソッド
		public static void message(int count) {
		    System.out.println(count);
		}
		

}
