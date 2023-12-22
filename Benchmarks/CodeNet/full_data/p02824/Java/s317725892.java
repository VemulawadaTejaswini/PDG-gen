import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int v = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		int threshold;

		Integer[] a = new Integer[n];

		for (int i = 0 ; i < n ; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(a, Collections.reverseOrder());
		int possibilityNum = n;
		threshold = a[p-1];
		
		//自分以下の合計
		long stock = 0;
		for (int i = p +1 ; i < n ; i++) {
			stock += threshold - a[i] ;
		}
		
		int v2 = (v - p);
		if(v2 < 0) {
			v2 = 0;
		}
		//合計しなければならない値
		int addValue = (v2)*m ;
		for (int i = p ; i < n ; i++) {
			threshold = a[p-1];
			
			if(addValue >= stock) {
			 threshold += (int) ((addValue - stock)/(n - p) + 1);
			}
			
			if(threshold > (a[i] + m)) {
				possibilityNum = i;
				break;
			}
			
			if(i != n-1) {
				stock -= a[i+1];
			}
		}		

		System.out.println(possibilityNum);

	}



}