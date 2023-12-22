import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] S = new String[s.length()];
    int a = -1;
    int length = 0;
    S = s.split("");
    for (int i = 0; i < s.length(); i++) {
      if (S[i].equals("A") && a == -1) {
        a = i;
      }
      if (S[i].equals("Z") && a != -1) {
        length = i - a + 1;
      }
    }
    System.out.println(length);
  }
}
    