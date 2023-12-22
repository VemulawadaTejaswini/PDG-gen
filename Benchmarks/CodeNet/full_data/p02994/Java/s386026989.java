import java.util.*;
import java.math.*;
class helo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,l,i,c=0,sum=0,sum1=0,small;
        n=sc.nextInt(); l=sc.nextInt();
        int t[]=new int[n+1];
        for(i=0;i<n;i++)
  {
    t[i]=l+(i+1)-1;
    System.out.print(t[i]+" ");
    sum1=sum1+t[i];
  }
  for(i=0;i<n-1;i++)
  {
    if(t[i]==0)
    {
      c++; break;
    }
  }
  
  if(c==0)
  {
    if(sum1>=0)
    {
    small=t[0];
     for(i=1;i<n-1;i++)
     {
      if(t[i]<small)
      {
        small=t[i];
      }
     }
    }
    else
    {
      small=t[i];
      for(i=1;i<n-1;i++)
     {
      if(t[i]>small)
      {
        small=t[i];
      }
     }
    }
    for(i=0;i<n;i++)
    {
      sum=sum+t[i];
    }
//    System.out.println(small);
    sum=sum-small;
  }
  
  else
  {
    for(i=0;i<n;i++)
    {
      sum=sum+t[i];
    }
  }
  
  System.out.println(sum);
  
    }
}
