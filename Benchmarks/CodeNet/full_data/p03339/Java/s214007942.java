import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    String s = sc.next();
    int min = 300000;
    for (int i = 1; i < number; i++) {
      String s1 = s.substring(0, i - 1);
      String s2 = s.substring(i, number);
      int c1 = s1.replace("W", "").length();
      int c2 = s2.replace("E", "").length();
      int count = (s1.length() - c1) +(s2.length() - c2);
      if (count < min) {
        min = count;
      }
    }
    System.out.println(min);
  }
}