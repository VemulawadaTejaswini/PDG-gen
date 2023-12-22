
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
 {
	public static void main (String[] args)
	 {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(),a[]=new int[n],i;
            long sum=0;
            for(i=0;i<n;i++) {
            	a[i]=sc.nextInt();sum+=a[i];
            }
            Arrays.sort(a);
            sum-=a[n-1]/2;
            System.out.println(sum);
	 }
}