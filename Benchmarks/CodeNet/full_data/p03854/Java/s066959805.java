import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    s = s.replaceAll("dream", "").replaceAll("dreamer", "").replaceAll("erase", "").replaceAll("eraser", "");
    if (s == "") {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}