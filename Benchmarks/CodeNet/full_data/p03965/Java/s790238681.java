import java.util.*;
 
public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);    
    String S = sc.next();
    sc.close();

    String[] s = S.split("");

    int p = 0;

    for (int i = 0; i < s.length; i++) {
      if (s[i].equals("p")) {
        p++;
      }
    }

    System.out.println(s.length / 2 - p);

  }

}