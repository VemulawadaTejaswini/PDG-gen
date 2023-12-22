import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    
    if (M < N - 1) {
      System.out.println(0);
      return;
    }
    
    int a[] = new int[M];
    int b[] = new int[M];
    for (int i = 0; i < M; i++) {
      a[i] = Integer.parseInt(sc.next());
      b[i] = Integer.parseInt(sc.next());
    }
    boolean ok[][] = new boolean[N][N];
    for (int i = 0; i < M; i++) {
      ok[a[i] - 1][b[i] - 1] = true;
      ok[b[i] - 1][a[i] - 1] = true;
    }
    
    int ans = 0;
    
    Deque<state> stack = new ArrayDeque<state>();
    boolean flag[] = new boolean[N];
    int count = N;
    stack.addLast(new state(0, flag, count));
    while (!stack.isEmpty()) {
      state now = stack.removeLast();
      now.flag[now.num] = true;
      if (--now.left == 0) {
        ans++;
        continue;
      }
      for (int i = 0; i < N; i++) {
        if (ok[now.num][i] && !now.flag[i]) {
          stack.addLast(new state(i, now.flag, now.left));
        }
      }
    }
    System.out.println(ans);
  }
  
  public static class state {
    public int     num;
    public boolean flag[];
    public int     left;
    
    public state(int x, boolean list[], int count) {
      num = x;
      flag = list.clone();
      left = count;
    }
  }
}