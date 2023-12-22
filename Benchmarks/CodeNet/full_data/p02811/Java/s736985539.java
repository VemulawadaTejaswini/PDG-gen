import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int out = 0;

      for (int i = 0; i < n -2; i++) {
        if (s.startsWith("ABC", i)) {
          out++;
        }
      }
      System.out.println(out);
    }
}
