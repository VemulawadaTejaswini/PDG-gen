import java.util.*;

class Main{
  static class NCK{
    int max;
    long mod;
    long[] fac;
    long[] finv;
    long[] inv;
    NCK(int max,long mod){
      this.max=max;
      this.mod=mod;
      pre();
    }
    private void pre(){
      fac=new long[max];
      finv=new long[max];
      inv=new long[max];
      fac[0]=fac[1]=1;
      finv[0]=finv[1]=1;
      inv[1]=1;
      for(int i=2;i<max;i++){
        fac[i]=fac[i-1]*i%mod;
        inv[i]=mod-inv[(int)(mod%i)]*(mod/i)%mod;
        finv[i]=finv[i-1]*inv[i]%mod;
      }
    }
    long nCk(int n,int k){
      if(n<k){
        return 0;
      }
      if(n<0||k<0){
        return 0;
      }
      return fac[n]*(finv[k]*finv[n-k]%mod)%mod;
    }
  }
  static Node[] nodes;
  static long mod=1_000_000_007;
  static NCK nck;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    nck=new NCK(n+2,mod);
    nodes=new Node[n];
    for(int i=0;i<n;i++){
      nodes[i]=new Node();
    }
    for(int i=0;i<n-1;i++){
      int a=sc.nextInt()-1;
      int b=sc.nextInt()-1;
      Node.connect(nodes[a],nodes[b]);
    }
    for(int i=0;i<n;i++){
      System.out.println(aaa(nodes[i]));
    }
  }
  static long aaa(Node node){
    Ele res=new Ele();
    for(Edge edge:node.edges){
      res.add(calc(edge));
    }
    return res.pat;
  }
  static Ele calc(Edge edge){
    if(edge.vid){
      return edge.ele;
    }
    Ele res=new Ele();
    for(Edge next:edge.to.edges){
      if(next==edge.inv){
        continue;
      }
      res.add(calc(next));
    }
    edge.vid=true;
    res.stp++;
    return edge.ele=res;
  }
  static class Node{
    List<Edge> edges;
    Node(){
      edges=new LinkedList<>();
    }
    void add(Edge e){
      edges.add(e);
    }
    static void connect(Node n1,Node n2){
      Edge e1=new Edge(n1,n2);
      Edge e2=new Edge(n2,n1);
      e1.inv=e2;
      e2.inv=e1;
      n1.add(e1);
      n2.add(e2);
    }
  }
  static class Edge{
    Node fr;
    Node to;
    Edge inv;
    boolean vid;
    Ele ele;
    Edge(Node fr,Node to){
      this.fr=fr;
      this.to=to;
    }
  }
  static class Ele{
    long pat;
    int stp;
    Ele(){
      pat=1;
      stp=0;
    }
    void add(Ele o){
      pat=(int)(((pat*o.pat)%mod*nck.nCk(stp+o.stp,stp))%mod);
      stp+=o.stp;
    }
  }
}