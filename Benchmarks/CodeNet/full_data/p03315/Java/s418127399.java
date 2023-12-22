import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int p = 0;
    for(int i = 0; i < s.length(); i++) {
      if(String.valueOf(s.charAt(i)).equals("+")) p++;
    }
    System.out.println(2 * p - 4);
  }
}