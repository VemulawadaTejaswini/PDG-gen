 
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
 
		String s = sc.next(), h = "pg";
 
		int cnt = 0, n = s.length();
		for (int i = 0; i < n; i++) cnt += s.charAt(i) == h.charAt(i%2) ? (i % 2 == 0 ? -1 : 1) * 1 : 0;
 
		System.out.println(cnt);
	}
}