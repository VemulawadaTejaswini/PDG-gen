import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int head = s.length() - 1;
    int tail = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'A') {
        head = i;
        break;
      }
    }
    for (int i = s.length()-1; i >= 0; i--) {
      if (s.charAt(i) == 'Z') {
        tail = i;
        break;
      }
    }
    System.out.println(tail-head+1);
  }
}