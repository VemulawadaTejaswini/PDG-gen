import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            if((num1 * 100 + num2 *10 + num1) % 4 == 0){
              System.out.println("YES");
            } else {
              System.out.println("NO");
            }
          }
}