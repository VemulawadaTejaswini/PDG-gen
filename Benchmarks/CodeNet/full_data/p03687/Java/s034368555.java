import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 1000;
    boolean f = false;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) != s.charAt(0)) f = true;
    }
    if(f) {
    for(int i = 0; i < s.length(); i++) {
      char cha = s.charAt(i);
      boolean flg = true;
      String test = s;
      int count = 0;
      while(flg) {
        count++;
        String temp = "";
        for(int j = 0; j < test.length() - 1; j++) {
          if(test.charAt(j) == cha || test.charAt(j + 1) == cha) {
            temp += String.valueOf(cha);
          } else {
            temp += String.valueOf(test.charAt(j));
          }
        }
        test = temp;
        int c = 0;
        for(int j = 0; j < temp.length(); j++) {
          if(temp.charAt(j) != cha) c++;
        }
        if(c == 0) flg = false;
      }
      ans = Math.min(ans, count);
    }
    } else {
      ans = 0;
    }
    System.out.println(ans);
  }
}