import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    Node[] a = new Node[n];
    for(int i=0;i<n;i++){
      a[i]=new Node();
    }
    for(int i=0;i<n-1;i++){
      int aa=sc.nextInt()-1;
      int bb=sc.nextInt()-1;
      a[aa].es.add(bb);
      a[bb].es.add(aa);
    }
    for(int i=0;i<q;i++){
      a[sc.nextInt()-1].v+=sc.nextInt();
    }
    Deque<Node> dq = new ArrayDeque<>();
    dq.addFirst(a[0]);
    a[0].d=true;
    while(!dq.isEmpty()){
      Node hr=dq.pollFirst();
      hr.d=true;
      for(int t:hr.es){
        if(!a[t].d){
          a[t].v+=hr.v;
          dq.addFirst(a[t]);
        }
      }
    }
    for(int i=0;i<n-1;i++){
      System.out.print(a[i].v+" ");
    }
    System.out.println(a[n-1].v);
  }
  static class Node{
    boolean d=false;
    int v=0;
    Set<Integer> es = new HashSet<>();
  }
}