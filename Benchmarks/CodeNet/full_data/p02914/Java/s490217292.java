/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Main{
    static long[] a;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		a = new long[n];
		
		StringTokenizer str = new StringTokenizer(in.readLine());
		int j = 0;
		long all_xor = 0;
		while(str.hasMoreTokens()) {
		    a[j++] = Long.parseLong(str.nextToken());
		    all_xor ^= a[j-1];
		}
		
		long red = 0;
		long blue = 0;
		
		Arrays.sort(a);
		for(int i = a.length-1; i >= 0; i--) {
		    //System.out.println("i " + i + " a: " + a[i]);
		    //System.out.println("red : " + red + " blue: " + blue);
		    if(((red^a[i])+(red^a[i]^all_xor)) > ((all_xor^blue^a[i])+(blue^a[i]))) {
		        red ^= a[i];
		    } else {
		        blue ^= a[i];
		    }
		    //System.out.println("red : " + red + " blue: " + blue);
		}
		System.out.println(red+blue);
	}
}
