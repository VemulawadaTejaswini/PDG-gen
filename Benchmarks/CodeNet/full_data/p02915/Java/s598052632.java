import java.util.*;
import java.io.*;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n-1];
    int t=n-1;
    for(int i=0;i<t;i++)
    {
      a[i]=sc.nextInt();
    }
    int c=0;
    if(t==1){
      c=t+t;
      System.out.print(c);
    }
    else{
      c=c+a[t-1];
      int m=a[t-1];
      for(int i=t-2;i>=0;i--)
      {
        if(a[i]<=m){
          c=c+a[i];
          m=a[i];
        }
        else{
          break;
        }
      }
      c=c+m;
      System.out.print(c);
    }
  }
}