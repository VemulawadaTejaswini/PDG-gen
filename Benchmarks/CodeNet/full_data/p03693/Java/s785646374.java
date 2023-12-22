import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int red = sc.nextInt();
    int blue = sc.nextInt();
    int green = sc.nextInt();
    int number = 100 * red + 10 * blue + green;
    if (number % 4 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    
  }
}