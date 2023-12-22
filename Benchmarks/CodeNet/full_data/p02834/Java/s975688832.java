import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int u=sc.nextInt()-1;
    int v=sc.nextInt()-1;
    Node[] ns=new Node[n];
    for(int i=0;i<n;i++){
      ns[i]=new Node();
    }
    for(int i=0;i<n-1;i++){
      int a=sc.nextInt()-1;
      int b=sc.nextInt()-1;
      ns[a].add(b);
      ns[b].add(a);
    }
    Deque<Node> dq=new ArrayDeque<>();
    ListIterator<Integer> lit;
    dq.add(ns[v]);
    ns[v].vis();
    while(!dq.isEmpty()){
      Node cur=dq.pollFirst();
      lit=cur.el.listIterator();
      while(lit.hasNext()){
        int idx=lit.next();
        if(!ns[idx].v){
          dq.add(ns[idx]);
          ns[idx].vis();
          ns[idx].al=cur.al+1;
        }
      }
    }
    dq.add(ns[u]);
    ns[u].vis(false);
    while(!dq.isEmpty()){
      Node cur=dq.pollFirst();
      lit=cur.el.listIterator();
      while(lit.hasNext()){
        int idx=lit.next();
        if(ns[idx].v){
          dq.add(ns[idx]);
          ns[idx].vis(false);
          ns[idx].tl=cur.tl+1;
        }
      }
    }
    /*
    for(int i=0;i<n;i++){
      System.out.println(ns[i]);
    }
    */
    dq.add(ns[u]);
    while(!dq.isEmpty()){
      Node cur=dq.pollFirst();
      lit=cur.el.listIterator();
      //System.out.println(lit);
      while(lit.hasNext()){
        int idx=lit.next();
        if(ns[idx].al<cur.al){
          if(ns[idx].al<ns[idx].tl){
            lit.remove();
            break;
          }else{
            dq.add(ns[idx]);
          }
        }
      }
    }
    int max=0;
    dq.add(ns[u]);
    ns[u].vis();
    while(!dq.isEmpty()){
      Node cur=dq.pollFirst();
      lit=cur.el.listIterator();
      while(lit.hasNext()){
        int idx=lit.next();
        if(!ns[idx].v){
          max=Math.max(ns[idx].al-1,max);
          dq.add(ns[idx]);
          ns[idx].vis();
        }
      }
    }
    System.out.println(max-1);
  }
  static class Node{
    int al;
    int tl;
    boolean v;
    List<Integer> el;
    Node(){
      el=new ArrayList<>();
    }
    void add(int e){
      el.add(e);
    }
    void vis(){
      vis(true);
    }
    void vis(boolean vv){
      v=vv;
    }
    public String toString(){
      return al+":"+tl+":"+el.toString();
    }
  }
  static class Edge{
    int f;
    int t;
    Edge(int from,int to){
      f=from;
      t=to;
    }
  }
}