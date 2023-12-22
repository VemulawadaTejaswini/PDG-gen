import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int H = sc.nextInt();
   int W = sc.nextInt();
   int N = sc.nextInt();

   int ans =0;
   int wa =0;
   int t = 0;
   if(H>W) t = H;
   else t= W;
  
   if(N%t==0) ans = N/t;
   else ans = N/t +1;

   System.out.println(ans);
 }
}