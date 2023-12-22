/*package whatever //do not write package name here */

import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int f = 0;
		for(int i = 0;i < n;i++)
		a[i] = sc.nextInt();
		for(int i = 0;i < m;i++)
		b[i] = sc.nextInt();
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = b[0];i >= a[n - 1];i--)
		if(i > x && i <= y)
		{
		    System.out.print("No War");
		    f = 1;
		    break;
		}
		if(f != 1)
		System.out.print("War");
	}
}