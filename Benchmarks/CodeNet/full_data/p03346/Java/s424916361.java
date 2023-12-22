import java.lang.reflect.Array;
import java.util.*;
public class Main
{  


public static void main(String[] args)
	{
Scanner in=new Scanner(System.in);
 
 int n=in.nextInt();
 int a[]=new int[n];
 int p[]=new int [2000000];
int ans=0;
  for(int i=0;i<n;i++) {
	  a[i]=in.nextInt();
	  p[a[i]]=p[a[i]-1]+1;
	  ans=Math.max(ans, p[a[i]]);
  }
	
System.out.println(n-ans);
	
	}
}