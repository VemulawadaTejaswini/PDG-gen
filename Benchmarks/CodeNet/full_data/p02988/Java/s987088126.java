import java.util.*;

import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int[] p = new int[n];
		for(i=0;i<n;i++) {
			p[i] = parseInt(sc.next());
		}
		sc.close();
		int cnt=0;
		for(i=1;i<n-1;i++) {
			if((p[i-1] < p[i] && p[i] <= p[i+1])
			|| (p[i-1] >= p[i] && p[i] > p[i+1])) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
