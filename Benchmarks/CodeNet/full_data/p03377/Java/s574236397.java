import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());

    String result = "NO";
    if (A + B >= X && A <= X)
      result = "YES";
    System.out.println(result);

  }
}
