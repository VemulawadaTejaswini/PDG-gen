import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    scan.close();

    String fS = S.substring(0, (S.length()-1)/2);
    String bS = S.substring((S.length()+1)/2, S.length());

    if(kai(S) && kai(fS) && kai(bS)) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }

  public static boolean kai(String s) {
    StringBuffer sb = new StringBuffer(s);
    String rs = sb.reverse().toString();
    if(s.equals(rs)) {
      return true;
    }
    else {
      return false;
    }
  }
}