import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    Node[] ns=new Node[n];
    for(int i=0;i<n;i++){
      ns[i]=new Node(i);
    }
    for(int i=0;i<m;i++){
      int a=sc.nextInt()-1;
      int b=sc.nextInt()-1;
      ns[a].add(ns[b],1);
    }
    for(int i=0;i<n;i++){
      for(Node node:ns[i].lin1){
        for(Node node2:node.lin1){
          ns[i].add(node2,2);
        }
      }
    }
    for(int i=0;i<n;i++){
      for(Node node:ns[i].lin1){
        for(Node node3:node.lin2){
          ns[i].add(node3,3);
        }
      }
    }
    /*
    for(int i=0;i<n;i++){
      System.err.println(ns[i].lin1);
    }
    System.err.println();
    for(int i=0;i<n;i++){
      System.err.println(ns[i].lin2);
    }
    System.err.println();
    for(int i=0;i<n;i++){
      System.err.println(ns[i].lin3);
    }
    System.err.println();
    */
    int s=sc.nextInt()-1;
    int t=sc.nextInt()-1;
    Deque<Node> dq=new ArrayDeque<>();
    ns[s].dist=0;
    dq.addLast(ns[s]);
    ns[s].vid();
    while(!dq.isEmpty()){
      Node hr=dq.pollFirst();
      for(Node nx:hr.lin3){
        if(nx.vid){continue;}
        nx.dist=hr.dist+1;
        dq.addLast(nx);
        nx.vid();
      }
    }
    System.out.println(ns[t].dist);
  }
  static class Node{
    int id;
    Set<Node> lin1=new HashSet<>();
    Set<Node> lin2=new HashSet<>();
    Set<Node> lin3=new HashSet<>();
    boolean vid=false;
    int dist=-1;
    Node(int id){
      this.id=id;
    }
    void add(Node n,int i){
      if(i==1){
        lin1.add(n);
      }else if(i==2){
        lin2.add(n);
      }else if(i==3){
        lin3.add(n);
      }else{
        
      }
    }
    void vid(){
      vid=true;
    }
    public String toString(){
      return String.valueOf(id);
    }
  }
}