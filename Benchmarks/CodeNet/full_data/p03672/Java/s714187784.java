import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();

    sc.close();

    for (int i = 2; i < S.length(); i = i + 2) {
      String s = S.substring(0, (S.length() - i) / 2);
      String s2 = s + s;
      if (S.indexOf(s2) != -1) { 
        System.out.println(s2.length());
        break;
      }
    }
    
  }

}