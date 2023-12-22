import java.io.*;
import java.util.*;
public class agc029_a{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long ans = 0;
		long b = 0;
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i)=='B') 
				b += 1;
			else
				ans += b;
		System.out.println(ans);
	}
}