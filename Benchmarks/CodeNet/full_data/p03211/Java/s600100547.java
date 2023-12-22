import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.next();		
		sc.close();
		
		int len = s.length();
		int[] a = new int[len-2];
		int c = 0;
		for (int i = 0; i<len-2; i++) {
			a[i] = Integer.parseInt(s.substring(c, c+3));
			c++;
		}
		int[] b = new int[len-2];

		for (int i = 0; i<len-2; i++) {
			b[i] = Math.abs(753 - a[i]);
		}
		
		Arrays.sort(b);

		System.out.println(b[0]);
	}
}
