import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

      System.out.println(ABC(S));
  }

  private static int ABC(String S) {
      int result = Integer.MAX_VALUE;
      for (String s : new String[] {"A", "B", "C"}) {
          int count = S.length() - S.replace(s, "").length();
          result = Math.min(result, count);
      }
      return result;
  }
}