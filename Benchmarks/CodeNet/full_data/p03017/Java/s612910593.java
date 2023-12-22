import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt()-1;
    int B = sc.nextInt()-1;
    int C = sc.nextInt()-1;
    int D = sc.nextInt()-1;
    String S = sc.next();
    boolean twoRock = false;
    for (int i = 1; i < N; i++) {
      if (A < i && i < Math.max(C, D)
          && S.charAt(i-1) == '#'
          && S.charAt(i) == '#') {
        twoRock = true;
      }
    }
    if (twoRock) {
      System.out.println("No");
      return;
    }
    if (C < D) {
      System.out.println("Yes");
      return;
    }
    
    boolean overtake = false;
    for (int i = 1; i < N-1; i++) {
      if (B <= i && i+1 <= C
          && S.charAt(i-1) == '.'
          && S.charAt(i) == '.'
          && S.charAt(i+1) == '.') {
        overtake = true;
      }
    }
    System.out.println(overtake ? "Yes" : "No");
  }
}