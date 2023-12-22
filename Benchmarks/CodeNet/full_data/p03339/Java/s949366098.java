import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    String directionOriginal = sc.next();
    int min = 300000;
    for (int i = 1; i < number; i++) {
      String direction1 = directionOriginal.substring(0, i - 1);
      String direction2 = directionOriginal.substring(i, number);
      String directionChange1 = direction1.replace("W", "");
      String directionChange2 = direction2.replace("E", "");
      int count = (direction1.length() - directionChange1.length()) +(direction2.length() - directionChange2.length());
      if (count < min) {
        min = count;
      }
    }
    System.out.println(min);
  }
}