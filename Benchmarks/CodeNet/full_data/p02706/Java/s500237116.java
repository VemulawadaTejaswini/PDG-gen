import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int   n = sc.nextInt();
     int m = sc.nextInt();
     for(int i=0;i<m;i++){
       n-=sc.nextInt();
     }
     int ans = Math.max(n,0);
     System.out.println(ans);
   }
}
