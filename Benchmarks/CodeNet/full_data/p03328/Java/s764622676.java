import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());

    int n = b - a;

    System.out.println(n * (n + 1) / 2 - b);
  }
}