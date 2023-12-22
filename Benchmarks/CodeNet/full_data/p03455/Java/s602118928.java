import java.util.*;

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int ans = (num1 * num2) % 2;
      
      if(ans == 0) {
          System.out.println("Even");
      }
      else {
          System.out.println("Odd");
      }
    }
}