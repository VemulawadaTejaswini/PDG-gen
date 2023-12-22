import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    static ContestScanner in;static Writer out;static StringBuilder sb=new StringBuilder();
    public static void main(String[] args)
    {try{in=new ContestScanner();out=new Writer();Main solve=new Main();solve.solve();
        in.close();out.flush();out.close();}catch(IOException e){e.printStackTrace();}}
    void solve() throws NumberFormatException, IOException{
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Pair[] p = new Pair[m];
        for (int i = 0; i < m; i++) {
            int b = in.nextInt();
            int c = in.nextInt();
            p[i] = new Pair(c, b);
        }
        Arrays.sort(a);
        Arrays.sort(p);
        int cur = m - 1;
        for (int i = 0; i < n; i++) {
            if (a[i] < p[cur].a) {
                a[i] = p[cur].a;
                p[cur].b--;
            }
            if (p[cur].b == 0) {
                cur--;
                if (cur < 0) {
                    break;
                }
            }
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

class Pair implements Comparable<Pair>{
    int a,b;final int hash;Pair(int a,int b){this.a=a;this.b=b;hash=(a<<16|a>>16)^b;}
    public boolean equals(Object obj){Pair o=(Pair)(obj);return a==o.a&&b==o.b;}
    public int hashCode(){return hash;}
    public int compareTo(Pair o){if(a!=o.a)return a<o.a?-1:1;else if(b!=o.b)return b<o.b?-1:1;return 0;}
    @Override
    public String toString() {
        return String.format("(%d, %d)", a, b);
    }
}

class Writer extends PrintWriter{
    public Writer(String filename)throws IOException
    {super(new BufferedWriter(new FileWriter(filename)));}
    public Writer()throws IOException{super(System.out);}
}
class ContestScanner implements Closeable{
    private BufferedReader in;private int c=-2;
    public ContestScanner()throws IOException
    {in=new BufferedReader(new InputStreamReader(System.in));}
    public ContestScanner(String filename)throws IOException
    {in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
    public String nextToken()throws IOException {
        StringBuilder sb=new StringBuilder();
        while((c=in.read())!=-1&&Character.isWhitespace(c));
        while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public String readLine()throws IOException{
        StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
        while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public long nextLong()throws IOException,NumberFormatException
    {return Long.parseLong(nextToken());}
    public int nextInt()throws NumberFormatException,IOException
    {return(int)nextLong();}
    public double nextDouble()throws NumberFormatException,IOException
    {return Double.parseDouble(nextToken());}
    public void close() throws IOException {in.close();}
}