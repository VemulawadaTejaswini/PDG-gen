import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    int result = 0;
    if(A == B) result = C;
    if(B == C) result = A;
    if(A == C) result = B;

    System.out.println(result);

  }
}
