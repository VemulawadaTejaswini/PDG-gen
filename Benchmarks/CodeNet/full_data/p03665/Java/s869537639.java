import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int P = sc.nextInt();
    int odd = 0;
    for(int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if(a % 2 == 1) odd++;
    }
    long ans = (long)Math.pow(2, N - 1);
    if(odd == 0) {
      ans = (long)Math.pow(2, N);
      if(P == 1) ans = (long)Math.pow(2, N) - ans;
    } else { 
      if(P == 1) ans = (long)Math.pow(2, N) - ans;
    }
    System.out.println(ans);
  }
}