import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    
    if (n * 500 >= k) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}