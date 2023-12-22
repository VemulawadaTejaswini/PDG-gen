import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int N1 = N % 10;
    int N2 = (N % 100 - N1) /10;
    int N3 = (N % 1000 - N2 - N1) /100;
    int N4 = N / 1000;
    if (N1 == N2 && N2 == N3) {
      System.out.println("Yes");
    } else if (N2 == N3 && N3 == N4) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}