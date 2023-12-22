import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String [] s = new String[N];
		int cnt = 0;
		int cntA = 0;
		int cntB = 0;
		int cntboth = 0;
		for (int i = 0; i < N; i++) {
			 s[i] = sc.next();
			 if(s[i].charAt(0) == 'B') {
				 cntB++;
				 if(s[i].charAt(s[i].length()-1) == 'A') {
					 cntA++;
					 cntboth++;
				 }
			 }
			 else if(s[i].charAt(s[i].length()-1) == 'A') {
				 cntA++;
			 } 
			 for (int j = 0; j < s[i].length() - 1; j++) {
				 if (s[i].charAt(j) == 'A') {
					 if(s[i].charAt(j+1) == 'B') {
						 cnt++;
					 }
				 }
			 }
		}
		if (cntA == 0 || cntB == 0) {
			System.out.println(cnt);
		}
		else if (cntA == cntB && cntA == cntboth) {
			System.out.println(cnt + cntA - 1);
		}
		else if(cntA < cntB) {
			System.out.println(cnt + cntA);
		}
		else {
			System.out.println(cnt + cntB);
		}

	}
}	
