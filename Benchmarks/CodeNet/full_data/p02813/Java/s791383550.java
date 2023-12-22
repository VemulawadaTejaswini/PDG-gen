import java.util.*;

public class Main {
  public static ArrayList<Integer> list; 
  public static int[] used;
  public static int[] perm;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    used = new int[n + 1];
    list = new ArrayList<Integer>();
    perm = new int[n];
    dfs(0, n);
    Collections.sort(list);
    int p = 0;
    int q = 0;
    for(int i = 0; i < n; i++) {
      int k = sc.nextInt();
      int s = k * ((int)Math.pow(10, n - 1 - i));
      p += s;
    }
    for(int i = 0; i < n; i++) {
      int k = sc.nextInt();
      int s = k * ((int)Math.pow(10, n - 1 - i));
      q += s;      
    }
    int a = 0;
    int b = 0;
    for(int i = 0; i < list.size(); i++) {
      int d = list.get(i);
      if(p == d) a = i;
      if(q == d) b = i;
    }
    int ans = Math.abs(a - b);
    System.out.println(ans);
  }
 
  public static void dfs(int pos, int n) {
    if(pos == n) {
      int t = 0;
      for(int i = 0; i < n; i++) {
        int k = perm[i];
        int s = k * ((int)Math.pow(10, n - 1 - i));
        t += s;      
      }
      list.add(t);      
    } else {
      for(int i = 1; i <= n; i++) {
        if(used[i] == 0) {
          perm[pos] = i;
          pos++;
          used[i] = 1;
          dfs(pos, n);
          used[i] = 0;
          pos--;
        }     
      }      
    }
  }
}