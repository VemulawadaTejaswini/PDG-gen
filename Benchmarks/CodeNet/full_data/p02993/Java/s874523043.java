import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();

    for (int i = 1; i < S.length() - 1; i++) {
      if ((S.charAt(i - 1) == S.charAt(i)) || (S.charAt(i) == S.charAt(i + 1))) {
        System.out.println("Bad");
        return;
      }
    }
    System.out.println("Good");
  }
}
