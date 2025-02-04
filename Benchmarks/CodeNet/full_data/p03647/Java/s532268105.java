import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    ArrayList[] list = new ArrayList[N];
    for(int i = 0; i < N; i++) {
      list[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < M; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      list[a].add(b);
      list[b].add(a);
    }
    ArrayList<Integer> list0 = list[0];
    String ans = "IMPOSSIBLE";
    for(int i = 0; i < list0.size(); i++) {
      int v = list[list0.get(i)];
      if(list[v].contains(N - 1)) {
        ans = "POSSIBLE";
        break;
      }
    }
    System.out.println(ans);
  }
}