import java.util.*;
import java.lang.*;
public class Main{
 public static void main(String []args){
 int n,m,total,i,count;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   m=sc.nextInt();
   total=0;
   count=0;
   int ar[]=new int[n];
   for (i=0;i<n;i++){
   int temp=sc.nextInt();
     ar[i]=temp;
     total+=temp;
   }
   int val;
   val=(int)Math.ceil((double)total/(4.0*m));
   
   for (i=0;i<n;i++){
   if (ar[i]>=val){
   count++;
   }
     if(count>=m){
     break;
     }
   }
   if(count>=m){
   System.out.println("Yes");
   }
   else{
   System.out.println("No");
   }
 } 
}
