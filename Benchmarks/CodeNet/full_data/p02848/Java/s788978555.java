import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    String s = input.next();

    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      char newc = (char)('A' + (c - 'A' + n) % 26);
      sb.append(newc);
    }

    System.out.println(sb.toString());
  }
}
