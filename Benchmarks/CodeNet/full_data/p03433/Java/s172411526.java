import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());

    String result = N % 500 < A ? "Yes" : "No";
    System.out.println(result);

  }
}
