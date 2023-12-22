import java.util.*;

import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int M = 5;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		char[] s = null; 
		char[] ma = new char[M]; 
		for (i = 0; i < n; i++) {
			s = sc.next().toCharArray();
			switch(s[0]) {
			case 'M':
				ma[0]++;
				break;
			case 'A':
				ma[1]++;
				break;
			case 'R':
				ma[2]++;
				break;
			case 'C':
				ma[3]++;
				break;
			case 'H':
				ma[4]++;
				break;
			}
		}
		sc.close();
		long ans = 0L;
		long tmp = 1L;
		for (i = 0; i < M-2; i++) {
			for (j = i+1; j < M-1; j++) {
				for (k = j+1; k < M; k++) {
					tmp = ma[i]*ma[j]*ma[k];
					ans += tmp;
				}
			}
		}
		out.println(ans);
	}
}
