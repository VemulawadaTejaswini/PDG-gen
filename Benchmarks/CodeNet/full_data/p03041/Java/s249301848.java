import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();

    char[] c = s.toCharArray();
    char target = c[k - 1];
    char replaced = Character.toLowerCase(target);

    StringBuilder sb = new StringBuilder(s);
    sb.setCharAt(k - 1, replaced);

    System.out.println(sb);
    
  }
}