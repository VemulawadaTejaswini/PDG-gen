import java.util.*;
import java.io.*;

public class Main {
    static class Point{
        int x,y;
        Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    static void swap(Point [] p,int i,int j){
        Point temp=p[i];
        p[i]=p[j];
        p[j]=temp;
    }
    static double ttl=0,cnt=0;

    static double sqrt(int a){
        return Math.sqrt(a);
    }
    static int sq(int a){
        return a*a;
    }
    static void calculateDist(Point [] a){
        for(int i=1;i<a.length;i++){
            ttl+=sqrt(sq(a[i].x-a[i-1].x)+sq(a[i].y-a[i-1].y));
        }
    }
    static void permutataion(Point [] point,int l,int r){
        if(l==r){
            cnt++;
            calculateDist(point);
            return;
        }
        for(int i=l;i<=r;i++){
            swap(point,l,i);
            permutataion(point, l+1, r);
            swap(point,l,i);
        }
    }


    public static void main(String [] args) throws IOException{
        FastScanner sc=new FastScanner();
        int n=sc.nextInt();
        Point [] point=new Point[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            point[i]=new Point(x,y);
        }
        permutataion(point, 0, n-1);
        System.out.println(ttl/cnt);

    }
}






























class FastScanner{	
    private int BUFFER_SIZE = 1 << 16;
   
   private  DataInputStream din;
   
   private  byte[] buffer;
   
   private int bufferPointer, bytesRead;
   
   public FastScanner() {
       din = new DataInputStream(System.in);
       buffer = new byte[BUFFER_SIZE];
       bufferPointer = bytesRead = 0;
   }

   public FastScanner( String file_name) throws IOException {
       din = new DataInputStream(new FileInputStream(file_name));
       buffer = new byte[BUFFER_SIZE];
       bufferPointer = bytesRead = 0;
   }
   
   public String readLine() throws IOException {
        byte[] buf = new byte[64];
       int cnt = 0, c;
       while ((c = read()) != -1) {
           if (c == '\n')
               break;
           buf[cnt++] = (byte) c;
       }
       return new String(buf, 0, cnt);
   }
   
   public String next() throws IOException{

       byte c = read();
       while(Character.isWhitespace(c)){
           c = read();
       }
       
        StringBuilder builder = new StringBuilder();
       builder.append((char)c);
       c = read();
       while(!Character.isWhitespace(c)){
           builder.append((char)c);
           c = read();
       }
       
       return builder.toString();
   }

   public int nextInt() throws IOException {
       int ret = 0;
       byte c = read();
       while (c <= ' ')
           c = read();
        boolean neg = (c == '-');
       if (neg)
           c = read();
       do {
           ret = ret * 10 + c - '0';
       } while ((c = read()) >= '0' && c <= '9');

       if (neg)
           return -ret;
       return ret;
   }
   
   public int[] nextIntArray( int n) throws IOException {
        int arr[] = new int[n];
       for(int i = 0; i < n; i++){
           arr[i] = nextInt();
       }
       return arr;
   }

   public long nextLong() throws IOException {
       long ret = 0;
       byte c = read();
       while (c <= ' ')
           c = read();
        boolean neg = (c == '-');
       if (neg)
           c = read();
       do {
           ret = ret * 10 + c - '0';
       } while ((c = read()) >= '0' && c <= '9');
       if (neg)
           return -ret;
       return ret;
   }
   
   public long[] nextLongArray( int n) throws IOException {
        long arr[] = new long[n];
       for(int i = 0; i < n; i++){
           arr[i] = nextLong();
       }
       return arr;
   }

   public char nextChar() throws IOException{
       byte c = read();
       while(Character.isWhitespace(c)){
           c = read();
       }
       return (char) c;	
   }
   
   public double nextDouble() throws IOException {
       double ret = 0, div = 1;
       byte c = read();
       while (c <= ' ')
           c = read();
        boolean neg = (c == '-');
       if (neg)
           c = read();

       do {
           ret = ret * 10 + c - '0';
       } while ((c = read()) >= '0' && c <= '9');

       if (c == '.') {
           while ((c = read()) >= '0' && c <= '9') {
               ret += (c - '0') / (div *= 10);
           }
       }

       if (neg)
           return -ret;
       return ret;
   }
   
   public double[] nextDoubleArray( int n) throws IOException {
        double arr[] = new double[n];
       for(int i = 0; i < n; i++){
           arr[i] = nextDouble();
       }
       return arr;
   }

   private void fillBuffer() throws IOException {
       bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
       if (bytesRead == -1)
           buffer[0] = -1;
   }

   private byte read() throws IOException {
       if (bufferPointer == bytesRead)
           fillBuffer();
       return buffer[bufferPointer++];
   }

   public void close() throws IOException {
       if (din == null)
           return;
       din.close();
   }

}

