import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
      
      long n=s.nextLong();
      long m=s.nextLong();
      long []a=new long[m];
      long sum=0;
      for(long i=0;i<m;i++)
      {
      a[i]=s.nextLong();
        sum+=a[i];
      }
      if(sum==n)
        System.out.println(0);
     else if(sum>n)
      {
       System.out.println(sum-n);
      }
      else
        System.out.println(-1);
      
    }
}