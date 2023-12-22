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
    public String next(){
      return nextBuilder().toString();
    }
    public StringBuilder nextBuilder(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)){
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb;
    }
    public double nextDouble(){
      return Double.parseDouble(next());
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
    public String[] nextA(int n){
      String[] a = new String[n];
      nextA(a,n);
      return a;
    }
    public void nextA(String[] a,int n){
      nextA(a,0,n);
    }
    public void nextA(String[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i]=next();
      }
    }
    public int[] nextAint(int n){
      int[] a = new int[n];
      nextAint(a,n);
      return a;
    }
    public void nextAint(int[] a,int n){
      nextAint(a,0,n);
    }
    public void nextAint(int[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextInt();
      }
    }
    public Integer[] nextAInt(int n){
      Integer[] a = new Integer[n];
      nextAInt(a,n);
      return a;
    }
    public void nextAInt(Integer[] a,int n){
      nextAInt(a,0,n);
    }
    public void nextAInt(Integer[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextInt();
      }
    }
    public long[] nextALong(int n){
      long[] a = new long[n];
      nextALong(a,n);
      return a;
    }
    public void nextALong(long[] a,int n){
      nextALong(a,0,n);
    }
    public void nextALong(long[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextLong();
      }
    }
    public double[] nextADouble(int n){
      double[] a = new double[n];
      nextADouble(a,n);
      return a;
    }
    public void nextADouble(double[] a,int n){
      nextADouble(a,0,n);
    }
    public void nextADouble(double[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextDouble();
      }
    }
    public List<Integer> nextLInt(int n){
      List<Integer> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextInt());
      }
      return l;
    }
    public List<Long> nextLLong(int n){
      List<Long> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextLong());
      }
      return l;
    }
    public List<Double> nextLDouble(int n){
      List<Double> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextDouble());
      }
      return l;
    }
  }
  static Scnr sc=new Scnr();
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String[] args){
    int n=sc.nextInt();
    int q=sc.nextInt();
    Node[] ns=new Node[n];
    for(int i=0;i<n;i++){
      ns[i]=new Node();
    }
    for(int i=0;i<n-1;i++){
      int a=sc.nextInt()-1;
      int b=sc.nextInt()-1;
      ns[a].lin.add(ns[b]);
      ns[b].lin.add(ns[a]);
    }
    for(int i=0;i<q;i++){
      int p=sc.nextInt()-1;
      long x=sc.nextInt();
      ns[p].dv+=x;
    }
    Deque<Node> dq=new ArrayDeque<>();
    dq.add(ns[0]);
    ns[0].vid=true;
    while(!dq.isEmpty()){
      Node hr=dq.pollFirst();
      for(Node nx:hr.lin){
        if(nx.vid){
          continue;
        }
        nx.dv+=hr.dv;
        dq.add(nx);
        nx.vid=true;
      }
      hr.v=hr.dv;
    }
    for(int i=0;i<n;i++){
      out.println(ns[i].v);
    }
    out.flush();
  }
  static class Node{
    List<Node> lin=new LinkedList<>();
    long dv=0;
    long v=0;
    boolean vid=false;
  }
}