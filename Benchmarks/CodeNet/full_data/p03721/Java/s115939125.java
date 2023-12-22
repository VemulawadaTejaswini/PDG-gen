import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    long[] t = new long[100000+1];
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      t[a] += b;
    }
    int i = 1;
    long count = 0;
    while (i < t.length && count+t[i] < K) {
      count += t[i];
      i++;
    }
    System.out.println(i);
  }
}