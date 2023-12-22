import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, x;
    
    a = sc.nextInt();
    b = sc.nextInt();
    x = (a + b) / 2;
    if((a + b) % 2 != 0) {
      x += 1;
    }
    System.out.println(x);
  }
}
