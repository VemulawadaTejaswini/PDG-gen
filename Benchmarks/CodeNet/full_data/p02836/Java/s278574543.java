import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;

    for (int i = 0; i < s.length()/2; i++) {

      char k = s.charAt(i);
      char g = s.charAt(s.length()-i-1);
      if (k != g) {
        count++;
      }

    }

    System.out.println(count);

  }

}
