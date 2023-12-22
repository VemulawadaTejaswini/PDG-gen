package abc110;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		System.out.println(result(S,T));

		sc.close();
	}

	private static String result(String S,String T) {
		int n = S.length();
		
		char[] array_S = S.toCharArray();
		char[] array_T = T.toCharArray();

		for(int i = 0 ;i < n; i++) {
			if(array_S[i] != array_T[i]) {
				char x = array_S[i] ;
				char y = array_T[i]; 
				
				for(int j = 0; j < n ;j++) {
					char c = S.charAt(j);
					if(c == x) {
						array_S[j]=y;
					}else if(c == y) {
						array_T[j]=x;
					}
				}
			}
		}
		
		for(int i = 0 ;i < n; i++) {
			if(array_S[i] != array_T[i]) {
				return "No";
			}
		}
		return "Yes";
	}
}