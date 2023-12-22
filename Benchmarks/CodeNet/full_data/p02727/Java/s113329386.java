/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		ArrayList<Long> p = new ArrayList<Long>();
		ArrayList<Long> q = new ArrayList<Long>();
		ArrayList<Long> r = new ArrayList<Long>();
		for(long i=0;i<a;i++) {
			p.add(sc.nextLong());
		}
		for(long i=0;i<b;i++) {
			q.add(sc.nextLong());
		}
		for(long i=0;i<c;i++) {
			r.add(sc.nextLong());
		}
		Collections.sort(p,Collections.reverseOrder());
		Collections.sort(q,Collections.reverseOrder());
		Collections.sort(r,Collections.reverseOrder());
		long res = 0;
		for(int i=0;i<x;i++) {
			res+=p.get(i);
		}
		for(int i=0;i<y;i++) {
			res+=q.get(i);		
		}
		int i = (int)x-1, j = (int)y-1; 
		for(int k=0;k<c;k++) {
			if(q.get(j)>r.get(k) && p.get(j)>r.get(k))
				break;
			if(q.get(j)>p.get(i)) {
				if(p.get(i)<r.get(k)) {
					res=res-p.get(i)+r.get(k);
					i--;
				}
			}
			else {
				if(q.get(j)<r.get(k)) {
					res=res-q.get(j)+r.get(k);
					j--;
				}
			}
		}
		System.out.println(res);
		sc.close();

	}
}
