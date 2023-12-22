import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Main{
  static int n;
  static int[] a, b;

  static List< List< Integer > > graph;

  static final boolean DEBUG = false;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    a = new int[n - 1];
    b = new int[n - 1];
    for(int i = 0; i < n - 1; i++){
      a[i] = sc.nextInt() - 1;
      b[i] = sc.nextInt() - 1;
    }

    graph = new ArrayList< >(n);
    for(int i = 0; i < n; i++){
      graph.add(new ArrayList< >());
    }
    for(int i = 0; i < n - 1; i++){
      graph.get(a[i]).add(b[i]);
      graph.get(b[i]).add(a[i]);
    }

    int[] parent = new int[n];
    dfs(0, n - 1, -1, parent);

    List< Integer > path = new ArrayList< >();
    int v = n - 1;
    while(parent[v] != -1){
      path.add(v);
      if(DEBUG){
        System.out.println("v = " + v);
      }
      v = parent[v];
    }
    path.add(0);

    Set< Integer > r = new HashSet< >();
    for(int i = 0; i < path.size() / 2; i++){
      r.add(path.get(i));
    }

    Set< Integer > ns0 = new HashSet< >();
    int w = -1;
    for(int i = path.size() - 1; i >= path.size() / 2; i--){
      ns0.remove(w);
      w = path.get(i);
      for(int x : graph.get(w)){
        if(!r.contains(x)){
          ns0.add(x);
        }
      }
      if(DEBUG){
        System.out.println("ns0 = " + ns0);
      }
      if(ns0.size() > (n - (ns0.size() + path.size()))){
        System.out.println("Fennec");
        return;
      }
    }
    ns0.remove(w);

    if(DEBUG){
      System.out.println("path.size() = " + path.size());
      System.out.println(ns0);
      System.out.println("ns0.size() = " + ns0.size());
    }

    if(ns0.size() > (n - (ns0.size() + path.size()))){
      System.out.println("Fennec");
    }
    else{
      System.out.println("Snuke");
    }
  }

  static void dfs(int v, int t, int p, int[] parent){
    parent[v] = p;
    if(v == t){
      return;
    }
    for(int w : graph.get(v)){
      if(w != p){
        dfs(w, t, v, parent);
      }
    }
  }
}