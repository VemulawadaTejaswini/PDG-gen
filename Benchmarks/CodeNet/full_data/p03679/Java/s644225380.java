import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int expiration = sc.nextInt();
            int buyday = sc.nextInt();
            int eatday = sc.nextInt();
            if(-buyday + eatday >= expiration + 1){
              System.out.println("dangerous");
            } else if(-buyday + eatday <= expiration) {
              System.out.println("delicious");
            } else {
              System.out.println("safe");
            }
      }
}