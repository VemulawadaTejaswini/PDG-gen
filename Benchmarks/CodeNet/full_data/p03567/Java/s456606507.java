import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "No";
    for(int i = 0; i < s.length() - 1; i++) {
      if((s.charAt(i) == 'A') && (s.charAt(i + 1) == 'C')) ans = "Yes";
    }
    System.out.println(ans);
  }
}