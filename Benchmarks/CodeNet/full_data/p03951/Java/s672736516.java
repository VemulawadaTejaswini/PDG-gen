import java.util.*;
import java.math.*;
import java.lang.String;
import java.lang.System;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();

		String sarr[]  = s.split("");
		String tarr[] = t.split("");
		int ans = 2 * n;
        int cnt = 0;
		int i = 0;
		while (i < n) {
			if (sarr[i].equals(tarr[0])) {
				int j = i;
				int k = 0;
				loop1: while (j < n) {
					if (!sarr[j].equals(tarr[k])) {
						break loop1;
					}
					cnt++;
					j++;
					k++;
				}
				if (j == n) {
					ans = ans - cnt;
				}
			}
			i++;
		}
		
		System.out.println(ans);
	}
}