import java.util.*;

class Main {
  public static void main(String[] args) {
    String s, t, res = "";
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine();
    t = sc.nextLine();
    
    int i = 0, j = 0;
    while(i < s.length() && j < t.length()) {
      if(s.charAt(i) == t.charAt(j)) {
        res += s.charAt(i);
        i++; j++;
      } else {
        if(i+1 < s.length() && s.charAt(i+1) == t.charAt(j)) {
          res += t.charAt(j);
          j++; i += 2;
        } else if(j+1 < t.length() && s.charAt(i) == t.charAt(j+1)) {
          res += s.charAt(i);
          i++; j += 2;
        } else {
          i++; j++;
        }
      }
    }
    System.out.println(res);
  }
}