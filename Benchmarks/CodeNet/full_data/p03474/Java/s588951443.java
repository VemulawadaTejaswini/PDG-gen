import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = sc.next();
    String ans = "Yes";

    for (int i = 0; i < a; i++) {
      if (s.charAt(i) == '-') {
        ans = "No";
      }
    }

    if (s.charAt(a) != '-') {
      ans = "No";
    }

    for (int i = a+1; i < b; i++) {
      if (s.charAt(i) == '-') {
        ans = "No";
      }
    }

    System.out.println(ans);

  }

}
