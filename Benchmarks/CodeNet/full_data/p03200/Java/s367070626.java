import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String sb = new String();

    int count = 0;

    while (!s.equals(sb)) {
      sb = new String(s);
      s.replaceFirst("BW", "WB");
      count++;
    }
    System.out.println(count);
  }

}
