import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 long n=s.nextLong();
	 long a=s.nextLong();
	 long b=s.nextLong();
	 long p=Math.max(a,b);
	 long q=Math.min(a,b);
	 long ans=0;
	 long sum=p-q;;
	 if(sum%2==0)
	 System.out.println(sum/2);
	 else
	 {long r=n-p;
	 if(r<q)
	 {System.out.println(n-q);}
	 else
	 {System.out.println(p-1);}}}}