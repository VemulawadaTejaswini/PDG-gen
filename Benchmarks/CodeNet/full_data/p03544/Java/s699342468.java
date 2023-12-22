import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long L = 1;
    long l = 2;
    long m;

    if(N == 1) {
      System.out.println(1);
    } else {
    for(int i=1; i<N; i++) {
      m = L;
      L = L + l;
      l = m;
    }
    System.out.println(L);
  }
}
}