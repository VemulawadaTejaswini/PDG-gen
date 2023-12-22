import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String args[])
    {
     int t,n,tem,i,j,tem1,sum=0,pos=0;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     t=sc.nextInt();
     int a[]=new int[n]; int b[]=new int[n];
     for(i=0;i<n;i++)
     {
         a[i]=sc.nextInt(); b[i]=sc.nextInt();
     }
     for(i=0;i<n-1;i++)
     {
         for(j=i+1;j<n;j++)
         {
             if(b[j]>b[i])
             {
                 tem=b[i];
                 b[i]=b[j];
                 b[j]=tem;
                 
                 tem1=a[i];
                 a[i]=a[j];
                 a[j]=tem1;
             }
         }
     }
     if(a[0]<=t)
     {
     for(i=0;i<n;i++)
     {
         t=t-a[i];
         if(t>0)
         {
             sum=sum+b[i];
         }
         else
         {
             pos=i;sum=sum+b[pos];break;
         }
     }
     
     }
     else
     {
      for(i=0;i<n-1;i++)
     {
         for(j=i+1;j<n;j++)
         {
             if(a[j]<a[i])
             {
                 tem=a[i];
                 a[i]=a[j];
                 a[j]=tem;
                 
                 tem1=b[i];
                 b[i]=b[j];
                 b[j]=tem1;
             }
         }
     }
      for(i=0;i<n;i++)
      {
          t=t-a[i];
          if(t>0)
          {
              sum=sum+b[i];
          }
          else
          {
              pos=i;  sum=sum+b[pos];break;
          }
      }
     
     }
     /*for(i=0;i<n;i++)
     {*/
     System.out.println(sum);
    //}
    }
}

