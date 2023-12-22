import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int[] a = new int[3];
   for(int i=0;i<3;i++) a[i] = sc.nextInt();
 
   Arrays.sort(a);
   
   int ss = 0;
   int s = a[0];
   for(int i=1;i<3;i++) 
   {
     if(s==a[i])
     {
       ss++;
     }
     s = a[i];
   }
   
   String ans = "No";
   if(ss==1) ans = "Yes";
   System.out.print(ans);
 }
}