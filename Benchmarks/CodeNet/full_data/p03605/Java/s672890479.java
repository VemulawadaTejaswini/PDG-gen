import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer i = sc.nextInt();
    String s = i.toString();
    if(s.contains("9")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}