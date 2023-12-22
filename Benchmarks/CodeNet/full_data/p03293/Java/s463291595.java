import java.util.*;
import java.io.*;

class Main {
  public static String rotate(String s, int offset) {
    int i = offset % s.length();
    return s.substring(i) + s.substring(0, i);
  }
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      String S = sc.next();
      String T = sc.next();
      boolean flag = false;
      for (int i = 0; i < S.length(); i++) {
        if (T.equals(rotate(S,i))) {
          flag = true;
        }
      }
      if (flag) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    }
  }
}
