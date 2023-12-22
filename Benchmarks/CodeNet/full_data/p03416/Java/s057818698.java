import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int count = 0;
    for (int i = A; i <= B; i++) {
      String s = Integer.toString(i);
      if (s.charAt(0) == s.charAt(4) && s.charAt(1) == s.charAt(3)) {
        count++;
      }
    }
    System.out.println(count);
  }
}