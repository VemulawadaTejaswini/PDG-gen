import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = Integer.parseInt(sc.next());
    int n2 = Integer.parseInt(sc.next());

    int ans = 6 / (n1 * n2);


    System.out.println(ans);


  }
}
