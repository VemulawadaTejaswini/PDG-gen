import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    Node[] hope = new Node[n];
    for (int i=0; i<n; i++) {
      hope[i] = new Node(sc.nextInt(), sc.nextInt(), sc.next()=="B");
    }

    int max=0;
    for (int x0=0; x0<2*k; x0++){
      for (int y0=0; y0<2*k; y0++){
        int fail=0, succ=0;
        for (Node t: hope){
          int x = (t.x - x0 + 2*k) % (2*k);
          int y = (t.y - y0 + 2*k) % (2*k);
          boolean b = (x<k && y<k)||(x>=k && y>=k);
          if (b==t.b){
            succ++;
          } else {
            fail++;
            if (n-fail<=max) break;
          }
        }
        // System.err.println(succ+"/"+fail);
        if (max<succ) max=succ;
      }
    }
    System.out.println(max);
  }
}

class Node{
  int x;
  int y;
  boolean b; // isBlack
  Node(int x, int y, boolean b){
    this.x = x;
    this.y = y;
    this.b = b;
  }
}
