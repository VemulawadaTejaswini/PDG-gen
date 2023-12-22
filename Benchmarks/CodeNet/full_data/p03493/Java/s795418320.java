import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String ss = sc.next();
    int count = 0;
    
    for (int i = 0; i <= 2; i++) {
      if (ss.charAt(i) == '1') {
        count++;
      }
    }
    System.out.println(count);
  }
}