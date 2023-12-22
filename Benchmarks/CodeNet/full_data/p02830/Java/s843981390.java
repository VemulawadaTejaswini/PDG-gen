import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    String b = sc.next();
    String c = sc.next();

    char[] bC = b.toCharArray();
    char[] cC = c.toCharArray();

    String result = "";
    for (int i = 0; i < a; i++) {
      result = result + bC[i] + cC[i];
    }
    System.out.println(result);
  }
}
