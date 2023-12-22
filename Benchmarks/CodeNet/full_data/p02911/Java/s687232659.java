import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long k = Long.parseLong(sc.next());
    int q = Integer.parseInt(sc.next());
    long[] score = new long[n];
    for(int i = 0; i < n; i++) {
      score[i] = k - q;
    }
    for(int i = 0; i < q; i++) {
      score[Integer.parseInt(sc.next())-1] += 1;
    }
    int count = 0;
    for(int i = 0; i < n; i++) {
      if(score[i] > 0) System.out.println("Yes");
      else System.out.println("No");
    }
  }
}
