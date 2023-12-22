import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//入力を取得します
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();

		
		List<Integer> a = new ArrayList<>(n);
		List<Integer> b = new ArrayList<>(n);
		for (int i = 0 ; i < n; i++) {
		  int sin1 = sc.nextInt();
		  int sin2 = sc.nextInt();
		  a.add(sin1);
		  b.add(sin2);
		}
		sc.close();
		
	
		//計算部分

		int count = 0;
		
		Collections.sort(a,Comparator.reverseOrder());
		Collections.sort(b,Comparator.reverseOrder());
		int a1 = a.get(0);
		roop:
		for (int i=0; i<n; i++) {
			if (b.get(i) > a1){
				h -= b.get(i);
				count++;
				if (h <= 0) {
					break roop;
				}
				if (i == n-1) {
					if (h%a1 == 0) {
						count += h/a1;
						break roop;
					} else {
						count += h/a1 + 1;
						break roop;
					}
					
				}
				
			} else {
				if (h%a1 == 0) {
					count += h/a1;
					break roop;
				} else {
					count += h/a1 + 1;
					break roop;
				}
			}
			
		}
		
		mes(count);
	}

		//回答を表示するメソッド
		public static void mes(int count) {
		    System.out.println(count);
		}
		

}
