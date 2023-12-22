import java.util.Arrays;
import java.util.Scanner;

public class Main  {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);    
		int N=s.nextInt();		
		long A[][]=new long[N][3];
      for(int i=0;i<N;i++)
      {
         for(int j=0;j<3;j++)
         {
           A[i][j]=s.nextInt();
         }
      }
      long a=A[N-1][0],b=A[N-1][1],c=A[N-1][2];
      System.out.println(a+" "+b+" "+c);
      for(int i=N-2;i>=0;i--)
      {
    	long p=a,q=b,r=c;  
        a=(long)Math.max(q+A[i][0],r+A[i][0]);
        b=(long)Math.max(p+A[i][1],r+A[i][1]);
        c=(long)Math.max(p+A[i][2],q+A[i][2]);
      //  System.out.println(a+" "+b+" "+c);
      }
      long m=(long)Math.max(a,(long)Math.max(b,c));
      System.out.println(m);
	}
}
