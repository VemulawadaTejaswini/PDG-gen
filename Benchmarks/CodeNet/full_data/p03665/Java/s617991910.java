import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int P = sc.nextInt();
    int odd = 0;
    for (int i = 0; i < N; i ++) {
      if (sc.nextInt()%2 == 1) odd++;
    }
    
    long oddComb = 0;
    for (int i = 1; i <= odd; i+=2) {
      oddComb += comb(odd, i);
    }
    
    System.out.println(P == 1
      ? oddComb : (1L<<N)-oddComb);
  }
  private static long comb(int a, int b) {
    long numer = 1;
    long denom = 1;
    for (int i = 0; i < b; i++) {
      numer *= a-i;
      denom *= i+1;
    }
    return numer/denom;
  }
}