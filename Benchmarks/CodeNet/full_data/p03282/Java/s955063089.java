import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();
      long K = in.nextLong();
      
      for (int i = 0; i < S.length(); ++i) {
        if (S.charAt(i) != '1') {
          System.out.println(S.charAt(i));
          break;
        }
      }
    }
  }
}