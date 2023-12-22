import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if (!S.contains("1") || !S.contains("0")) {
      System.out.println(S.length() / 2);
    } else {
      char first = S.charAt(0);
      int count = 0;
      for (int i = 1; i < S.length(); i++) {
        if (S.charAt(i) != first) {
          first = S.charAt(i);
        } else {
          String s[] = S.split("");
          if (s[i].equals("1"))
            s[i] = "0";
          else
            s[i] = "1";
          count++;
          S = String.join("", s);
          first = s[i].charAt(0);
          System.out.println(S);
        }
      }
      System.out.println(count);
    }
  }
}