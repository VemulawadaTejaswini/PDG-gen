/*
	submission # - User: herp_sy
	https://atcoder.jp/contests/
*/

import java.util.*;
import java.util.Collections; // sorting use
import java.io.*;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args){
		int cnt = 0;
		String s,t;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		t = sc.next();
		for(int i = 0; i < 3; ++i) {
			if(s.charAt(i) == t.charAt(i))	++cnt;
		}
		out.println(cnt);
	}
}
