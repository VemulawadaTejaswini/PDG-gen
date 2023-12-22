import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	public static void main (String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long y = in.nextLong();
 
		
			int len = 1;
			x += x;
			while(x <= y) {
				++len;
				x += x;
			}
 
			System.out.println(len);
		
 
 	}
 
}