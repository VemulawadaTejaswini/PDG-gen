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
		
		Collections.sort(s1);
		Collections.sort(s2);
		int s1a = s1.get(n - 1);
		
		 roop : for (int i = 0 ; i < n ; i++) {
			 if (s2.get(n - 1 - i) > s1a) {
	            	h -= s2.get(n - 1 - i);
	     		count++;
	            if (h <= 0) {
	                message(count);
	                break roop;
	            }
	            if (n - 1- i == 0 && h > 0) {
	            	count = count + h/s1a + 1;
	            	message(count);
	            }
		    } else {
		    	    count = count + h/s1a ;
		    	    message(count);
		    	    break roop;
		    	    
			}
		}
	    
		
	}
	
		//回答を表示するメソッド
		public static void message(int count) {
		    System.out.println(count);
		}
		