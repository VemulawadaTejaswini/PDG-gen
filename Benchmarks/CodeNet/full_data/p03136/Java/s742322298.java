import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int sum = 0;
      int maxi = 0;
      
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        int a = sc.nextInt();
        sum += a;
        if (maxi < a) maxi = a;
      }

      System.out.println(maxi * 2 < sum ? "Yes" : "No"); 
    } finally {
      sc.close();
    }
  }
}
