import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = 0;
            if(a >= 2){
              ans += a - 1;
            }
            if(b >= a){
              ans++;
            }
            System.out.println(ans);
          }
}