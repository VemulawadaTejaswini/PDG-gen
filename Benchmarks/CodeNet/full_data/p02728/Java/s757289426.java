import java.util.*;
import java.io.*;

class Main{
  static class Scnr{
    private final InputStream ins;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    Scnr(){
      this(System.in);
    }
    Scnr(InputStream in){
      ins = in;
    }
    private boolean hasNextByte(){
      if(ptr<buflen){
        return true;
      }else{
        ptr = 0;
        try{
          buflen = ins.read(buffer);
        }catch(IOException e){
          e.printStackTrace();
        }
        if(buflen<=0){
          return false;
        }
      }
      return true;
    }
    private int readByte(){
      if(hasNextByte()){
        return buffer[ptr++];
      }else{
        return -1;
      }
    }
    private static boolean isPrintableChar(int c){
      return 33<=c&&c<=126;
    }
    public boolean hasNext(){
      while(hasNextByte()&&!isPrintableChar(buffer[ptr])){
        ptr++;
      }
      return hasNextByte();
    }
    public long nextLong(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if(b=='-'){
        minus=true;
        b=readByte();
      }
      if(b<'0'||'9'<b){
        throw new NumberFormatException();
      }
      while(true){
        if('0'<=b&&b<='9'){
          n*=10;
          n+=b-'0';
        }else if(b==-1||!isPrintableChar(b)){
          return minus?-n:n;
        }else{
          throw new NumberFormatException();
        }
        b=readByte();
      }
    }
    public int nextInt(){
      long nl=nextLong();
      if(nl<Integer.MIN_VALUE||Integer.MAX_VALUE<nl){
        throw new NumberFormatException();
      }
      return (int) nl;
    }
  }
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
    long inv(long i){
      return inv[(int)i];
    }
  }
  static Node[] nodes;
  static long mod=1_000_000_007;
  static NCK nck;
  static Scnr sc=new Scnr();
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String[] args){
    int n=sc.nextInt();
    nck=new NCK(n+2,mod);
    nodes=new Node[n];
    for(int i=0;i<n;i++){
      nodes[i]=new Node();
    }
    for(int i=0;i<n-1;i++){
      int a=sc.nextInt()-1;
      int b=sc.nextInt()-1;
      Edge e=new Edge(nodes[a],nodes[b]);
      nodes[a].add(e);
      nodes[b].add(e);
    }
    for(int i=0;i<n;i++){
      out.println(aaa(nodes[i]));
    }
    out.flush();
  }
  static long aaa(Node node){
    if(node.ele!=null){
      return node.ele.pat;
    }
    Ele res=new Ele();
    for(Edge edge:node.edges){
      res.add(calc(node,edge));
    }
    node.ele=res;
    return res.pat;
  }
  static Ele calc(Node from,Edge edge){
    if(edge.getEle(from)!=null){
      return edge.getEle(from);
    }
    if(from.ele!=null&&edge.getEle(edge.to(from))!=null){
      Ele res=from.ele.copy();
      Ele dash=edge.getEle(edge.to(from));
      dash.stp--;
      res.sub(dash);
      edge.setEle(res,from);
      if(edge.to(from).ele==null){
        Ele et=new Ele();
        et.add(edge.getEle(edge.to(from)));
        et.add(edge.getEle(from).pat,edge.getEle(from).stp-1);
        edge.to(from).ele=et;
      }
      return res;
    }
    Ele res=new Ele();
    Node to=edge.to(from);
    for(Edge next:to.edges){
      if(next==edge){
        continue;
      }
      res.add(calc(to,next));
    }
    res.stp++;
    edge.setEle(res,from);
    if(edge.both()){
      Ele ef=new Ele();
      ef.add(edge.elefrto);
      ef.add(edge.eletofr.pat,edge.eletofr.stp-1);
      Ele et=new Ele();
      et.add(edge.eletofr);
      et.add(edge.elefrto.pat,edge.elefrto.stp-1);
      edge.fr.ele=ef;
      edge.to.ele=et;
    }
    return res;
  }
  static class Node{
    List<Edge> edges;
    Ele ele;
    Node(){
      edges=new LinkedList<>();
    }
    void add(Edge e){
      edges.add(e);
    }
  }
  static class Edge{
    Node fr;
    Node to;
    Ele elefrto;
    Ele eletofr;
    Node to(Node from){
      if(from==fr){
        return to;
      }else if(from==to){
        return fr;
      }else{
        return null;
      }
    }
    Ele getEle(Node node){
      if(node==fr){
        return elefrto;
      }else if(node==to){
        return eletofr;
      }else{
        return null;
      }
    }
    void setEle(Ele ele,Node node){
      if(node==fr){
        elefrto=ele;
      }else if(node==to){
        eletofr=ele;
      }
    }
    boolean both(){
      return elefrto!=null&&eletofr!=null;
    }
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
    Ele add(Ele o){
      return add(o.pat,o.stp);
    }
    Ele add(long p,int s){
      pat=(((pat*p)%mod*nck.nCk(stp+s,stp))%mod);
      stp+=s;
      return this;
    }
    Ele sub(Ele o){
      return sub(o.pat,o.stp);
    }
    Ele sub(long p,int s){
      pat=((pat*nck.inv(p))%mod*nck.inv(nck.nCk(stp,s))%mod);
      stp-=s;
      return this;
    }
    Ele copy(){
      Ele res=new Ele();
      res.pat=pat;
      res.stp=stp;
      return res;
    }
    public String toString(){
      return "["+pat+":"+stp+"]";
    }
  }
}
