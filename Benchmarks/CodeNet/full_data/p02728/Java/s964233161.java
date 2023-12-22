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
  static Scnr sc=new Scnr();
  static PrintWriter out = new PrintWriter(System.out);
  static Node[] nodes;
  static long mod=1_000_000_007;
  static NCK nck;
  static Map<Long,Ele> memo=new HashMap<>();
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
      nodes[a].add(b);
      nodes[b].add(a);
    }
    for(int i=0;i<n;i++){
      out.println(aaaa(i,-1).pat);
    }
    out.flush();
//    System.err.println(memo);
  }
  static long k(int root,int parent){
    return root*1000000L+parent;
  }
  static Ele calc(int root,int parent){
    if(memo.containsKey(k(root,parent))){
      return memo.get(k(root,parent));
    }
    if(memo.containsKey(k(parent,root))){
      return aaaa(root,parent);
    }
    Ele res=new Ele();
    for(int next:nodes[root].edges){
      if(next==parent){
        continue;
      }
      res.add(calc(next,root));
    }
    res.stp++;
    memo.put(k(root,parent),res);
    return res;
  }
  static Ele aaaa(int root,int parent){
    if(memo.containsKey(k(root,parent))){
      return memo.get(k(root,parent));
    }
    ListIterator<Integer> lit=nodes[root].edges.listIterator();
//    System.err.println(nodes[root].edges);
    Ele[] fro=new Ele[nodes[root].edges.size()];
    Ele[] bac=new Ele[nodes[root].edges.size()];
    
    fro[0]=new Ele();
    for(int i=1;i<fro.length;i++){
      fro[i]=new Ele(fro[i-1]);
      fro[i].add(calc(lit.next(),root));
    }
    Ele all=new Ele(fro[fro.length-1]);
    all.add(calc(lit.next(),root));
    all.stp++;
    memo.put(k(root,-1),all);
    
    bac[bac.length-1]=new Ele();
    for(int i=bac.length-2;i>=0;i--){
      bac[i]=new Ele(bac[i+1]);
      bac[i].add(calc(lit.previous(),root));
    }
    
    for(int i=0;i<fro.length;i++){
      fro[i].add(bac[i]);
      fro[i].stp++;
    }
    lit.previous();
    
    for(int i=0;i<fro.length;i++){
      memo.put(k(root,lit.next()),fro[i]);
    }
    return memo.get(k(root,parent));
  }
  static class Node{
    int idx;
    List<Integer> edges;
    Node(){
      edges=new LinkedList<>();
    }
    void add(int i){
      edges.add(i);
    }
  }
  static class Ele{
    long pat;
    int stp;
    Ele(){
      pat=1;
      stp=0;
    }
    Ele(Ele o){
      this(o.pat,o.stp);
    }
    Ele(long p,int s){
      pat=p;
      stp=s;
    }
    Ele add(Ele o){
      return add(o.pat,o.stp);
    }
    Ele add(long p,int s){
      pat=(((pat*p)%mod*nck.nCk(stp+s,stp))%mod);
      stp+=s;
      return this;
    }
    static Ele add(Ele s1,Ele s2){
      Ele res=new Ele(s1);
      res.add(s2);
      return res;
    }
    Ele sub(Ele o){
      return sub(o.pat,o.stp);
    }
    Ele sub(long p,int s){
      pat=((pat*nck.inv(p))%mod*nck.inv(nck.nCk(stp,s))%mod);
      stp-=s;
      return this;
    }
    static Ele sub(Ele s1,Ele s2){
      Ele res=new Ele(s1);
      res.sub(s1);
      return res;
    }
    Ele as(Ele o){
      return as(o.pat,o.stp);
    }
    Ele as(long p,int s){
      pat=p;stp=s;
      return this;
    }
    public String toString(){
      return "["+pat+":"+stp+"]";
    }
  }
}
