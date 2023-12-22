import java.util.Scanner;
public class Main{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c;
   if(b==100)
       c=a*1000+b;
   else
       c=a*100+b;

   int square[]=new int [103];


   for (int i=1;i<100;i++)
   {
       square[i]=i*i;

   }
   square[100]=12100;
   square[101]=44100;
   square[102]=96100;
   int start=0,end=102,mid,d=0;
   while(end>=start)
   {
       mid=(start+end)/2;
       if(c==square[mid])
       {
           d=1;
           break;
       }
       else if(c>square[mid])
           start=mid+1;
       else
           end=mid-1;

   }

       if(d==1)
           System.out.println("yes");
       else
           System.out.println("no");


   



   sc.close();
 }
}
