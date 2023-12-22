package beginner140.problemD;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int k = sc.nextInt();
			
			String inputStr = sc.next();

			int[] s = new int[n];
			for(int i = 0 ; i < n ; i++ ) {
				s[i] = (inputStr.charAt(i) == 76 ? -1 : 1);
			}
			
//			while (k > 0 ) {
//				//find diff point from left
//				int diffLeft = -1;
//				for(int i = 0 ; i < n - 1 ; i++ ) {
//					if ( s[i] != s[i+1] ) {
//						diffLeft = i;
//						break;
//					}
//				}
//				//no diff point
//				if ( diffLeft == -1 ) break;
//				
//				boolean isExchange = false;
//				for(int i = n - 1 ; i > diffLeft + 1; i-- ) {
//					if ( s[i] != s[i-1] && s[i] == s[diffLeft]) {
////						}
//						turnArray(s, diffLeft+1, i-1);
//						
//						isExchange = true;
//						break;
//					}
//				}
//				
//				if ( !isExchange ) {
//					turnArray(s, diffLeft+1, n-1);
//				}
//
//				k--;
//			}

			int po = 1;
			for(int i = 0 ; i < n -1 ; i++ ) {
				if ( s[i] != s[i+1]) {
					po++;
				}
			}
			
			int maxRotation = 0;
			if ( k * 2 < po ) {
				maxRotation = k; 
			}
			else {
				maxRotation = po / 2;
			}
			
			
			
			//count happiness
			int happiness = 0;
			
			for(int i = 1 ; i < n ; i++ ) {
				if ( s[i] == -1 && s[i-1] == -1) {
					happiness++;
				}
				if ( s[i-1] == 1 && s[i] == 1) {
					happiness++;
				}
			}
			
			//terminal case should be considered! 
			
			happiness += maxRotation * 2;
			
			System.out.println(happiness);
		}
	}
//	private static void turnArray(int[] s, int beginIndex, int endIndex) {
//		for(int i = beginIndex ; i < (endIndex + beginIndex) / 2 + 1; i++ ) {
//			int tmp = s[i];
//			s[i] = - s[endIndex - (i - beginIndex)];
//			s[endIndex - (i - beginIndex)] = - tmp;
//		}
//	}
}