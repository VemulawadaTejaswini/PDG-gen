import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String stringN = sc.next();
    int N = Integer.parseInt(stringN);
    int sN = 0;
    for (int i = 0; i < stringN.length(); i++) {
      sN += Character.getNumericValue(stringN.charAt(i));
    }
    if (N % sN == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}