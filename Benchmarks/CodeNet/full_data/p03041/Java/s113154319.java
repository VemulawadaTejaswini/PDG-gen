import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    sc.close();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (i == k - 1) sb.append(Character.toLowerCase(s.charAt(i)));
      else sb.append(s.charAt(i));
    }
    System.out.println(sb.toString());
  }
}
