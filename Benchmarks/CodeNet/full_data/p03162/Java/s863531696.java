import java.util.*;
public class Main
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int days=sc.nextInt();
   int act[][]=new int[days][3];
   for(int i=0;i<days;i++)
   {
     for(int j=0;j<3;j++)
     {
       act[i][j]=sc.nextInt();
     }
   }
   int sum=0,prev=-1;;
   for(int i=0;i<days;i++)
   {
     int max=-1;
     for(int j=0;j<3;j++)
     {
       if(act[i][j]>max&&j!=prev)
       {
         max=act[i][j];
         prev=j;
       }
     }
     sum+=max;
   }
   System.out.println(sum);
 }
}