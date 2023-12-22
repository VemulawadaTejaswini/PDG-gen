import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   char[] c = sc.next().toCharArray();
   int N = c.length;
   boolean b = true;
   boolean dame = false;
   int ans ;
   for(int i = 2;i<N;i+=2)
   {
     dame = false;
     for(int k = 0;k<(N-i)/2;k++)
     {
       if(c[k]!=c[k+(N-i)/2])
       {
         dame=true;
         break;
       }
     }
     if(!dame) ans = N-i;
   }
   System.out.println(ans);
 }
}