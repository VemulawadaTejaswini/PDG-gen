import java.util.*;

public class Main {
  public static void main() {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if (a == b == c) {
      System.out.println(1);
    }else if(a == b && b != c ||
             a == c && c != b ||
             b == c && a != b) {
      Sytem.out.println(2);
    }else {
      Sytem.out.println(3);
    }
  }
}
