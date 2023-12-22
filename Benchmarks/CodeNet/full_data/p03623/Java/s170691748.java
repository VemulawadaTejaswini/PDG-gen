import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
             x += 1000;
            if(x - a > x - b){
              System.out.println("A");
            } else {
              System.out.println("B");
            }
          }
}