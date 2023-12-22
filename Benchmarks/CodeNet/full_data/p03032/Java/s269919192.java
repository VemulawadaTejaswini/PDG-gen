import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] V = new int[N];
    for (int i = 0; i < N; i++) {
      V[i] = sc.nextInt();
    }
    
    int max = Integer.MIN_VALUE;
    for (int a = 0; a <= Math.min(N, K); a++) {
      for (int b = 0; a+b <= Math.min(N, K); b++) {
        int del = K-(a+b);
        int val = calc(V, a, b, del);
        max = Math.max(max, val);
      }
    }

    System.out.println(max);
  }
  
  private static int calc(int[] V, int a, int b, int del) {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int sum = 0;
    for (int i = 0; i < a; i++) {
      if (V[i] < 0) {
        q.offer(V[i]);
      }
      sum += V[i];
    }
    for (int i = 0; i < b; i++) {
      int v = V[V.length-1-i];
      if (v < 0) {
        q.offer(v);
      }
      sum += v;
    }
    while (!q.isEmpty() && del > 0) {
      int v = q.poll();
      sum -= v;
      del--;
    }
    return sum;
  }
}

