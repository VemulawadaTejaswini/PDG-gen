import java.util.*;
import java.io.*;

import static java.lang.Math.*;
import static java.lang.System.*;

class X {
  public long v;
  public X p;
  public ArrayList<X> c = new ArrayList<>();
}

public class Main {
  static void exec(X root) {
    for (X x : root.c) {
      x.v += root.v;
     // exec(x);
    }
  }
  
  
  public static void main(String ... args) throws Exception {
    if (false) {
      Scanner sc = new Scanner(System.in);
      // 整数の入力
      int a = sc.nextInt();
      // スペース区切りの整数の入力
      int b = sc.nextInt();
      int c = sc.nextInt();
      // 文字列の入力
      String s = sc.next();
      // 出力
      out.println((a+b+c) + " " + s);

      return;
    }
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    X[] tree = new X[n];
    for (int i=0; i<n; i++) {
      tree[i] = new X();
    }
    for (int i=0; i<n-1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      tree[b-1].p = tree[a-1];
      tree[a-1].c.add(tree[b-1]);
    }
    for (int i=0; i<q; i++) {
      int p = sc.nextInt();
      int x = sc.nextInt();
      tree[p-1].v += x;
    }

    X root = null;
    for (X x : tree) {
      if (x.p == null) {
        root = x;
        break;
      }
    }

    exec(root);
    
    for (X x : tree) {
      out.println(x.v);
    }
  }
  
  static int correct(Node c0, Node[] nodes, int lim) {
    if (c0.isCorrected) {
      return 0;
    }
//    err.println("correct: " + c0.id);
    c0.isCorrected = true;
    int ret = 0;
    int branch = 0;
    if (c0.jam) {
      ret++;
    }
    for (Integer x : c0.list) {
      int co = correct(nodes[x], nodes, 1);
      ret += co;
      if (co >= 1) {
        branch++;
        if (branch >= lim) {
          return ret;
        }
      }
    }
    return ret;
  }

  static class Node {
    public Node(int id) {
      this.id = id;
    }
    public final int id;
    public final ArrayList<Integer> list = new ArrayList<>();
    public boolean jam;
    public boolean isCorrected;
  }

  static int ama(int a, int b) {
    if (a == b) {
      return -1;
    }
    if (b > a) {
      int swap = b;
      b = a;
      a = swap;
    }
    int lim = a - 1;
    int fl = min(a - b, b);
    for (int i=lim; i>=fl; i--) {
      if (a % i == b %i) {
        return i;
      }
    }
    return 1;
  }
  
  static int gcd(int a, int b) {
    if (b > a) {
      int swap = b;
      b = a;
      a = swap;
    }
	int yo = a % b;
    if (yo == 0) {
      return b;
    }
    return gcd(b, yo);
  }
}
