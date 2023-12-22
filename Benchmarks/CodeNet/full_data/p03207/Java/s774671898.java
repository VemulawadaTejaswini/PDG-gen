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
		int n;
		ArrayList<Integer> p = new ArrayList<Integer>();
		Iterator iter = p.iterator();
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		n = sc.nextInt();
		for (int i = 0; i < n; ++i){
			p.add(sc.nextInt());
			sum += p.get(i);
		}
		sum -= Collections.max(p) / 2;
		out.println(sum);
	}
}
