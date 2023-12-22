import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      int ans = a * b;
      
      if (a % 2 == 0 || b % 2 == 0) {
        System.out.println(ans / 2);
      } else {
        System.out.println(ans / 2 + 1);
      }
      
    }
}