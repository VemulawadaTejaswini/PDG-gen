import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String S = in.next();
      int oneCBetween = 0;
      boolean otherLowerCase = true;
      
      for (int i = 2; i <= S.length() - 2; ++i) {
        if (S.charAt(i) == 'C') {
          ++oneCBetween;
        } else if (S.charAt(i) != 'A') {
          if (Character.isUpperCase(S.charAt(i))) {
            otherLowerCase = false;
          }
        }
      }

     if (Character.isUpperCase(S.charAt(1)) || Character.isUpperCase(S.charAt(S.length() - 1))) {
       otherLowerCase = false;
     }

      if (S.charAt(0) == 'A' && oneCBetween == 1 && otherLowerCase) {
        System.out.println("AC");
      } else {
        System.out.println("WA");
      }
    }
  }
}