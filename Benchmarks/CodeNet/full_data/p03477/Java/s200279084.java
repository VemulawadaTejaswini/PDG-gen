/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;

/*
	01010
 */
public class Main
{
	public static void main (String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		//int ans = Math.min(solve(s), solve(reverse(s)));
		//
		
		char[] arr = s.toCharArray();
		int cnt0 = 0;
		int cnt1 = 0;
		for(char c : arr) {
			if(c == '0')
				++cnt0;
			else 
				++cnt1;
		}

		System.out.println(Math.max(cnt0, cnt1));
 	}




 	private static String reverse(String s) {
 		StringBuilder ret = new StringBuilder();
 		char[] arr = s.toCharArray();

 		for(char c : arr) {
 			if(c == '0')
 				ret.append('1');
 			else 
 				ret.append('0');
 		}

 		return ret.toString();
 	}

}