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
		int slen = s.length();
		int tlen = t.length();
		int length = 0;
		int ans = slen + tlen;

		if (s.equals(t)) {
			ans = slen;
		}
		else {

			if (slen < tlen) {
				length = slen;
			} else {
				length = tlen;
			}

			int i = 0;
			while (i < length) {
				if (sarr[length - 1 - i].equals(tarr[i])) {
					ans--;
				} else {
					break;
				}
				i++;
			}
		}
		if (ans < n) {
			ans = n;
		}


		System.out.println(ans);
	}
}