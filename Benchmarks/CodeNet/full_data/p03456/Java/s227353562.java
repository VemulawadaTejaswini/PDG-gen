import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int k = Integer.parseInt(a+b);

    for (int i = 0; i < k; i++) {
      if (Math.pow(i,2) == k) {
        System.out.println("Yes");
        return;
      }
    }

    System.out.println("No");
    
  }

}
