import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
   int C = A +B;

   String msg = "Impossible";

   if(A % 3 == 0 || B % 3 == 0 || C % 3 == 0) msg = "Possible";

    System.out.println(msg);

}
}
