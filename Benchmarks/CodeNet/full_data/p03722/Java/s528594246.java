import java.util.*;

public class Main {
  public static void main(String[] args) {
    long INF = (long)Math.pow(10, 15);
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[M];
    int[] b = new int[M];
    long[] c = new long[M];
    for(int i = 0; i < M; i++) {
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
      c[i] = (-1) * sc.nextLong();
    }
    long[] dist = new long[N];
    for(int i = 0; i < N; i++) {
      dist[i] = INF;
    }
    dist[0] = 0;
    for(int i = 0; i < N - 1; i++) {
      boolean update = false;
      for(int j = 0; j < M; j++) {
        if(dist[a[j]] != INF && dist[b[j]] > dist[a[j]] + c[j]) {
          dist[b[j]] = dist[a[j]] + c[j];
          update = true;
        } 
      }
      if(!update) break;
    }
    long ans = dist[N - 1];

    for(int i = 0; i < N; i++) {
      dist[i] = INF;
    }
    dist[0] = 0;
    boolean[] negative = new boolean[N];
    for(int i = 0; i < N; i++) {
      boolean update = false;
      for(int j = 0; j < M; j++) {
        if(dist[a[j]] != INF && dist[b[j]] > dist[a[j]] + c[j]) {
          dist[b[j]] = dist[a[j]] + c[j];
          update = true;
          if(i == N - 1) negative[b[j]] = true;
          if(negative[a[j]]) negative[b[j]] = true;
        } 
      }
      if(!update) break;
    }
    if(negative[N - 1]) {
      System.out.println("inf");
    } else {
      System.out.println((-1) * ans);
    }    
  }
}