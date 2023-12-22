import java.util.*;

public class Main {
  public int P = 1;
  public static int[] c;
  public static int[] d;
  static  HashMap<Integer, ArrayList<Integer>> map1;
  static  HashMap<int[][], Integer> map2;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] u = new int[n - 1];
    int[] v = new int[n - 1];
    int[] w = new int[n - 1];
    map1 = new HashMap<Integer, ArrayList<Integer>>();
    map2 = new HashMap<int[][], Integer>();
    c = new int[n];
    d = new int[n];
    for(int i = 0; i < n - 1; i++) {
      u[i] = sc.nextInt() - 1;
      v[i] = sc.nextInt() - 1;
      w[i] = sc.nextInt();
      if(map1.containsKey(u[i])) {
        ArrayList<Integer> list = map1.get(u[i]);
        list.add(v[i]);
        map1.put(u[i], list);
      } else {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(v[i]);
        map1.put(u[i], list);
      }
      
      if(map1.containsKey(v[i])) {
        ArrayList<Integer> list = map1.get(v[i]);
        list.add(u[i]);
        map1.put(v[i], list);
      } else {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(u[i]);
        map1.put(v[i], list);
      }

      int[][] s1 = {u[i], v[i]};
      int[][] s2 = {v[i], u[i]};
      map2.put(s1, w[i]);
      map2.put(s2, w[i]);
    }

    c[0] = 0;
    d[0] = 1;
    
    dfs(0);
    for(int i = 0; i < n; i++) {
      System.out.println(c[i]);
    }
  }

  public void dfs(int g) {
    ArrayList<Integer> list1 = map1.get(g);
    for(int i = 0; i < list1.size(); i++) {
      int f = list1.get(i);
      if(d[f] == 0) {
        d[f] = 1;
        int[][] a = {g, f};
        int b = map2.get(a);
        if(b % 2 == 0) {
          c[f] = c[g];
        } else {
          c[f] = 1 - c[g];
        }
        dfs(f);
      }
    }
  }
}