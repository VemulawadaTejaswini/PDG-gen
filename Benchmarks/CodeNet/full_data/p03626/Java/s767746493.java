import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   char[] c1 = sc.next().toCharArray();
   char[] c2 = sc.next().toCharArray();
   long ans = 1;
   
   boolean skip = false;
   boolean afterskip = false;
   for(int i=0;i<N;i++)
   {
     if(skip)
     {
       skip = false;
       afterskip = true;
     }
     else
     {
       if(afterskip&&c1[i]!=c2[i])
       {
         ans*=3;
         skip = true;
         afterskip =false;
       }
       else if(afterskip)
       {
         afterskip = false;
       }
       else if(c1[i]!=c2[i])
       {
         if(i==0) ans*=6;
         else ans*=2;
         skip=true;
       }
       else
       {
         if(i==0) ans*=3;
         else ans*=2;
       }
     }
     if(ans>1000000007) ans=ans%1000000007;
   }
   System.out.println(ans);
 }
}