import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
    String tmp = "";
    for (int i = 0; i < s.length(); i++) {
      if (i == s.length() - 2 && s.charAt(i) == s.charAt(i + 1)) {
        count++;
        break;
      }
      if (tmp.length() == 1 && tmp.charAt(0) == s.charAt(i))
        tmp = String.valueOf(s.charAt(i++)) + String.valueOf(s.charAt(i));
      else
        tmp = String.valueOf(s.charAt(i));
      count++;
    }
    System.out.println(count);
  }
}