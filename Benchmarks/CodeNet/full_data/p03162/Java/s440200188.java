import java.util.*;
public class Main
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int days=sc.nextInt();
   int act[]=new int[n][3];
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<3;j++)
     {
       act[i][j]=sc.nextInt();
     }
   }
   int sum=0,prev=-1;;
   for(int i=0;i<n;i++)
   {
     int max=-1;
     for(int j=0;j<3;j++)
     {
       if(a[i][j]>max&&j!=prev)
       {
         max=a[i][j];
         prev=j;
       }
     }
     sum+=max;
   }
   System.out.println(sum);
 }
}