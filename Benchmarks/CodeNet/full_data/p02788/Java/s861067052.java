import java.util.*;
public class Main
{
  void main(String[] args)
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.newLong();
    long d=ob.newLong();
    long a=ob.newLong();
    long x[]=new long[];
    long h[]=new long[];
    sort(x,h,n);
    long k=0; 
    while(true)
    {
      int i=0;
      if(check(h,n)==0)
        break;
      i=max(h,n,d);
      reduce(x,h,i);
      k++;
    }
    System.out.println(
  }
  void sort(long x[],long h[],int n)
  {
    for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (x[j] < x[min_idx])
                    min_idx = j;
            long temp = x[min_idx];
            x[min_idx] = x[i];
            x[i] = temp;
            long temp2 = h[min_idx];
            h[min_idx] = h[i];
            h[i] = temp2;
        }
  }
  long check(long h[],int n)
  {
    long c=0;
    for(int i=0;i<n;i++)
    {
      c=c+h[i];
    }
    return c;
  }
  int max(long h[],int n,long d)
  {
    int k=0;
    long c=0;
    long max=0;
    for(int i=0;i<n;i++)
    {
      c=0;
      for(int j=i;x[j]<=x[i]+2d;j++)
      {
        c=c+h[i];
      }
      if(c>max)
        k=i;
    }
    return k;
  }
  void reduce(long x[],long h[],int t)
  {
    for(int i=t;x[i]<=x[t]+2d;i++)
    {
      h[i]=h[i]-a;
    }
  }
}
  
    
      
  