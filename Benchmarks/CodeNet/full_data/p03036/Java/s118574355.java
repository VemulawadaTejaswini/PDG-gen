import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int r = scanner.nextInt();
    int d = scanner.nextInt();
    int x = scanner.nextInt();
    
    for (int i = 0; i < 10; i++) {
      x = x * r - d;
      System.out.println(x + "\n");
    }
  }
}