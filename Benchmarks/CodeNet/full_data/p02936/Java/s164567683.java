import java.io.*;
import java.util.*;

/**
 * @author masayamatu
 * 
 */
public class Main {
  
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    Graph[] graph = new Graph[n+1];
    for(int i = 0; i < n+1; i++) {
      graph[i] = new Graph();
    }
    for(int i = 1; i < n; i++) {
      int a = sc.nextInt(); int b = sc.nextInt();
      graph[a].child.add(graph[b]);
      graph[b].child.add(graph[a]);
    }
    for(int i = 0; i < q; i++) {
      int a = sc.nextInt(); int b = sc.nextInt();
      graph[a].value += b;
      } 
    dfs(graph[1] , null , 0);
    
    for(int i = 1; i < n+1; i++) {
      System.out.println(graph[i].value+ " ");
    }
  }
  
  public static class Graph{
      int  value=0;
      List<Graph> child = new ArrayList<Graph>();
  }
  public static void dfs(Graph graph,Graph parent,int value) {
        graph.value += value;
          for(Graph i:graph.child) {
            if(i != parent) {
              dfs(i,graph,graph.value); 
            }
          }           
      }      
}
class FastScanner {
  private final InputStream in = System.in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;
  private boolean hasNextByte() {
      if (ptr < buflen) {
          return true;
      }else{
          ptr = 0;
          try {
              buflen = in.read(buffer);
          } catch (IOException e) {
              e.printStackTrace();
          }
          if (buflen <= 0) {
              return false;
          }
      }
      return true;
  }
  private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
  private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
  public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
  public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)) {
          sb.appendCodePoint(b);
          b = readByte();
      }
      return sb.toString();
  }
  public long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
          minus = true;
          b = readByte();
      }
      if (b < '0' || '9' < b) {
          throw new NumberFormatException();
      }
      while(true){
          if ('0' <= b && b <= '9') {
              n *= 10;
              n += b - '0';
          }else if(b == -1 || !isPrintableChar(b)){
              return minus ? -n : n;
          }else{
              throw new NumberFormatException();
          }
          b = readByte();
      }
  }
  public int nextInt() {
      long nl = nextLong();
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
      return (int) nl;
  }
  public double nextDouble() { return Double.parseDouble(next());}
}
