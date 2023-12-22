import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = "";
    if (a >= 13) s = Integer.toString(b);
    else if (6 <= a && a <= 12) s = Integer.toString(b/2);
    else s = "0";
    System.out.println(s);
  }
}
