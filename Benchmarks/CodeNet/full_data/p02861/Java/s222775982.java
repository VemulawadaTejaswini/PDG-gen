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
    public int[] nextAInt(int n){
      int[] a = new int[n];
      nextAInt(a,n);
      return a;
    }
    public void nextAInt(int[] a,int n){
      nextAInt(a,0,n);
    }
    public void nextAInt(int[] a,int off,int len){
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
  
  static Scnr sc = new Scnr();
  static PrintWriter out = new PrintWriter(System.out);
  static double sum=0;
  public static void main(String args[]){
    int n=sc.nextInt();
    int[] x=new int[n];
    int[] y=new int[n];
    
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
    }
    
    int[] per=new int[n];
    for(int i=0;i<n;i++){
      per[i]=i;
    }
    double t=0;
    int count=0;
    do{
      count++;
      for(int i=0;i<n-1;i++){
        t+=Math.hypot(x[per[i+1]]-x[per[i]],y[per[i+1]]-y[per[i]]);
      }
    }while(next_permutation(per));
    out.println(t/count);
    out.flush();
  }
  static boolean next_permutation(int[] per){
    if(per.length<2){
      return false;
    }
    int i;
    for(i=per.length-1;i>0;i--){
      if(per[i-1]<per[i]){
        break;
      }
    }
    if(0<i){
      i--;
      int tmp;
      int j;
      for(j=per.length-1;j>i;j--){
        if(per[j]>per[i]){
          break;
        }
      }
      //swap(i,j)
      tmp=per[i];
      per[i]=per[j];
      per[j]=tmp;
      for(int k=i+1;k<(i+1+per.length)/2;k++){
        //swap(k,per.length-k+i)
        tmp=per[k];
        per[k]=per[per.length-k+i];
        per[per.length-k+i]=tmp;
      }
      return true;
    }
    int tmp;
    for(int k=0;k<per.length;k++){
      //swap(k,per.length-k-1)
      tmp=per[k];
      per[k]=per[per.length-k-1];
      per[per.length-k-1]=tmp;
    }
    return false;
  }
}
