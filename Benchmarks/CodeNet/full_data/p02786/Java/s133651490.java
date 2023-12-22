import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long H = sc.nextLong();
   long ans = loop(H);
   System.out.println(ans);
 }
 static long loop(long h)
 {
   if(h==1) return 1;
   else return 2*loop(h/2) + 1;
 }
}