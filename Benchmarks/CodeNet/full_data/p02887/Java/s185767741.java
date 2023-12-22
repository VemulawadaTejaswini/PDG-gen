import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();
    char[] colors = s.toCharArray();

    char color = colors[0];
    StringBuilder res = new StringBuilder("" + colors[0]);
    for (int i = 1; i < colors.length; i++) {
      if (colors[i] != color) {
        res.append(colors[i]);
        color = colors[i];
      }
    }
    String resStr = res.toString();
    System.out.println(resStr.length());
  }
}
