import java.util.*;

public class Main {
  
  public static int[] d;
  public static HashMap<Integer, ArrayList<Integer>> map;
  public static int[] c;
  public static int p;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    map = new HashMap<Integer, ArrayList<Integer>>();
    for(int i = 0; i < n - 1; i++) {
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
      ArrayList<Integer> list1 = new ArrayList<Integer>();
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      if(map.containsKey(a[i])) list1 = map.get(a[i]);
      if(map.containsKey(b[i])) list2 = map.get(b[i]);
      list1.add(b[i]);
      list2.add(a[i]);
      map.put(a[i], list1);
      map.put(b[i], list2);
    }
    c = new int[n];
    for(int i = 0; i < n; i++) {
      c[i] = sc.nextInt();
    }
    Arrays.sort(c);
    d = new int[n];
    p = n - 1;
    dfs(0, -1);
    int sum = 0;
    for(int i = 0; i < n - 1; i++) {
      sum += ((int)Math.min(d[a[i]], d[b[i]]));
    }
    System.out.println(sum);
    for(int i = 0; i < n; i++) {
      System.out.print(d[i]);
      if(i < n - 1) System.out.print(" ");
    }
  }

  public static void dfs(int m, int parent) {
    ArrayList<Integer> list = map.get(m);
    d[m] = c[p];
    p--;
    for(int i = 0; i < list.size(); i++) {
      int t = list.get(i);
      if(t != parent) {
        dfs(t, m);
      }
    }
  }
}