import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    long K = Long.parseLong(sc.next());
    int[] count = new int[100001];
    for (int i =0; i<N; i++) {
      int a = Integer.parseInt(sc.next());
      count[a] += Long.parseLong(sc.next());
    }
    long total =0;
    int i =0;
    while (total < K) {
      total += (long)count[i];
      i++;
    }
    System.out.println(i-1);
  }
}