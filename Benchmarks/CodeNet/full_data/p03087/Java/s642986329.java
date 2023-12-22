import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int Q = scan.nextInt();
    scan.nextLine();
    String S = scan.nextLine();

    for (int i = 0; i < Q; i++) {
      int i1 = scan.nextInt();
      int i2 = scan.nextInt();

      String sub = S.substring(i1 - 1, i2);
      int count = 0;
      for (int j = 0; j < sub.length(); j++) {
        if(sub.charAt(j) == 'A'){
          if(j + 1 != sub.length() && sub.charAt(j + 1) == 'C'){
            count++;
          }
        }
      }
      System.out.println(count);
    }
  }
}
