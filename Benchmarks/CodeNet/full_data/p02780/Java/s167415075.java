import java.io.*;
import java.util.*;
public class Main{
    public static double find(int n)
    {int m=n;
    double val=(n*(n+1))/2;
    val=val/m;
    return val;}

     public static void main(String []args){
    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int k=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      a[i]=s.nextInt();
      double max=0.0;
      double sum=0;
      for(int i=0;i<k;i++)
      {sum+=find(a[i]);}
      max=sum;
      for(int i=k,j=0;i<n;i++,j++)
      {sum-=find(a[j]);
      sum+=find(a[i]);
      max=Math.max(max,sum);}
      System.out.println(max);
     }
}