import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    s = s.replaceAll("1", "2");
    s = s.replaceAll("9", "3");
    s = s.replaceAll("2", "9");
    s = s.replaceAll("3", "1");
    System.out.println(s);
  }
}