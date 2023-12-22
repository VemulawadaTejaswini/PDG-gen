import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])throws Exception
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    double sum=0;
    double product=1;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=Sc.nextInt();
      product=product*a[i];
    }
    for(int i=0;i<n;i++)
    {
      sum=sum+(product/a[i]);
    }
    sum=product/sum;
    System.out.println(sum);
  }
}