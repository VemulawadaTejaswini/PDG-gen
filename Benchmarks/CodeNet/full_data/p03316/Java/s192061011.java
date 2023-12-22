import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = Integer.toString(n);
    int cnt = 0;

    for (int i = 0; i < s.length(); i++) {
      cnt += Character.getNumericValue(s.charAt(i));
    }

    if ((n % cnt) == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}