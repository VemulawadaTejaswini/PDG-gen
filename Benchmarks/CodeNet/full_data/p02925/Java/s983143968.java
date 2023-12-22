import java.util.*;
import java.io.*;

class Main{
  static Scnr sc = new Scnr(System.in);
  public static void main(String[] args){
    int  n = sc.nextInt();
    Deque<Integer>[] dq = new Deque[n];
    for(int i=0;i<n;i++){
      dq[i]=new ArrayDeque<Integer>(n-1);
      for(int j=0;j<n-1;j++){
        dq[i].addLast(sc.nextInt()-1);
      }
    }
    int days=0;
    List<Integer> candi = new ArrayList<>(n);
    Set<Integer> match = new HashSet<>();
    for(int i=0;i<n;i++){
      candi.add(i);
    }
    while(true){
      while(!candi.isEmpty()){
        int i=candi.remove(0);
        if(!dq[i].isEmpty()&&!dq[dq[i].getFirst()].isEmpty()&&dq[dq[i].getFirst()].getFirst()==i){
          match.add(i);
          match.add(dq[i].getFirst());
          if(candi.contains(dq[i].getFirst())){
            candi.remove(candi.indexOf(dq[i].getFirst()));
          }
        }
      }
      candi.addAll(match);
      
      if(candi.isEmpty()){
        for(int j=0;j<n;j++){
          if(!dq[j].isEmpty()){
            System.out.println(-1);
            return;
          }
        }
        System.out.println(days);
        return;
      }else{
        for(int j:match){
          dq[j].removeFirst();
        }
      }
      
      days++;
      match.clear();
    }
  }
  
  static class Scnr{
    private final InputStream ins;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
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
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)){
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
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
}