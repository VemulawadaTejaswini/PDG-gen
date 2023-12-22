import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    char[] ch = s.toCharArray();
    char[] bh = t.toCharArray();
    boolean flag = false;
    Arrays.sort(ch);
    Arrays.sort(bh);
    if( Arrays.equals(ch, bh) ) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
  }
