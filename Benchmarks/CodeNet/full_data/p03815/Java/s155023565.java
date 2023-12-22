import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long N = sc.nextLong();
   long forans = N/11;
   
   long ans = forans*2;
   if(N-forans*11>6) ans+=2;
   else ans++;
   System.out.println(ans);
 }
}