import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   char[] c = sc.next().toCharArray();
   boolean b = true;
   int count=1;
   Arrays.sort(c);
   for(int i = 1;i<c.length;i++)
   {
     if(c[i]==c[i-1]) 
     {
       count++;
     }
     else
     {
       if(count%2!=0)
       {
         b = false;
         break;
       }
       else
       {
         count=1;
       }
     }
   }
   String ans;
   if(b) ans = "yes";
   else ans = "no";
   System.out.println(ans);
 }
}