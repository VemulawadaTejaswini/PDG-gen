import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] a = new int[N];
   for(int i=0;i<N;i++) a[i] = sc.nextInt();
   String ans = "APPROVED";
   for(int i =0; i<N;i++)
   {
     if(a[i] %2 == 0)
     {
       if(a[i]%3!=0&&a[i]%5!=0)
       {
         ans = "DENIED";
         break;
       }
     }
   }
   System.out.print(ans);
 }
}