import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int sum = 700;

    for (int i = 0; i < s.length(); i++) {
      String k = s.substring(i,i+1);
      if (k.equals("o")) {
        sum += 100;
      }
    }
    System.out.println(sum);
  }
}
