import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int w = sc.nextInt();
    String ans="";
    for (int i = 0; i < S.length(); i += w) {
      ans += S.charAt(i);
    }
    System.out.println(ans);
  }
}   