
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length; i+=2) {
      sb.append(s[i]);
    }
    System.out.println(sb.toString());
  }
}
