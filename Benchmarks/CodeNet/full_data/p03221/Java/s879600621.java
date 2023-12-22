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
  }
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String[] args){
    Scnr sc=new Scnr();
    int n=sc.nextInt();
    int m=sc.nextInt();
    PYN[] si=new PYN[m];
    List<PYN>[] cp= new List[n+1];
    for(int i=1;i<=n;i++){
      cp[i]=new ArrayList<PYN>();
    }
    for(int i=0;i<m;i++){
      si[i]=new PYN(sc.nextInt(),sc.nextInt());
      cp[si[i].p].add(si[i]);
    }
    for(int i=1;i<=n;i++){
      Collections.sort(cp[i],(s1,s2)->(s1.y-s2.y));
      for(int j=0;j<cp[i].size();j++){
        cp[i].get(j).n=j+1;
      }
    }
    for(int i=0;i<m;i++){
      p(si[i].p,si[i].n);
    }
    out.flush();
  }
  static class PYN{
    int p;
    int y;
    int n;
    PYN(int p,int y){
      this.p=p;
      this.y=y;
    }
  }
  static void p(int p,int n){
    StringBuilder sb=new StringBuilder();
    sb.append(p/100000);
    sb.append(p/10000%10);
    sb.append(p/1000%10);
    sb.append(p/100%10);
    sb.append(p/10%10);
    sb.append(p%10);
    
    sb.append(n/100000);
    sb.append(n/10000%10);
    sb.append(n/1000%10);
    sb.append(n/100%10);
    sb.append(n/10%10);
    sb.append(n%10);
    out.println(sb);
  }
}