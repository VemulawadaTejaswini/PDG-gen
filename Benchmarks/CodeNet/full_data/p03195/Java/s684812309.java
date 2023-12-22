
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
 {
	public static void main (String[] args)
	 {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(),i,j;
            long a[]=new long[n],sum=0;
            for(i=0;i<n;i++) {
            	a[i]=sc.nextLong();sum+=a[i];
            }
            if(sum%2==1)
            	System.out.println("first");
            else
            	System.out.println("second");
	 }
}