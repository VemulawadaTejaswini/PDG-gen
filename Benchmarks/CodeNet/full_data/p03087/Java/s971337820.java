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

    Pattern p = Pattern.compile("AC");

    for (int i = 0; i < Q; i++) {
      int i1 = scan.nextInt();
      int i2 = scan.nextInt();
      Matcher m = p.matcher(S.substring(i1 - 1, i2));
      int count = 0;
      while (m.find()) {
        count++;
      }
      System.out.println(count);
    }
  }
}
