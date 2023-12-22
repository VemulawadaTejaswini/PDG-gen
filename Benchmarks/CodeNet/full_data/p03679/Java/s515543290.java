import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());

    if(A >= B) System.out.println("delicious");
    else if(A + X + 1 < B ) System.out.println("dangerous");
    else System.out.println("safe");

}
}