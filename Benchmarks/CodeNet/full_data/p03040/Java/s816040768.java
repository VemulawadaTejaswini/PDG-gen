import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static ContestScanner in;static Writer out;static StringBuilder sb=new StringBuilder();
    public static void main(String[] args)
    {try{in=new ContestScanner();out=new Writer();Main solve=new Main();solve.solve();
        in.close();out.flush();out.close();}catch(IOException e){e.printStackTrace();}}
    void solve() throws NumberFormatException, IOException{
        int q = in.nextInt();
        Query[] query = new Query[q];
        List<Query> updates = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int type = in.nextInt();
            if (type == 1) {
                query[i] = new Query(type, in.nextInt(), in.nextInt());
                updates.add(query[i]);
            } else {
                query[i] = new Query(type, 0, 0);
            }
        }
        Collections.sort(updates);
        int updateN = updates.size();
        BIT bit = new BIT(updateN);
        BIT bitNum = new BIT(updateN);
        int idx = 0;
        Query pr = updates.get(0);
        for (Query u: updates) {
            if (u.a == pr.a) {
                u.p = pr.p;
            } else {
                u.p = ++idx;
            }
            pr = u;
        }
        long min = Integer.MAX_VALUE;
        long minA = 0;
        long bSum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            Query qr = query[i];
            if (qr.type == 1) {
                bSum += qr.b;
                bit.add(qr.p, qr.a);
                bitNum.add(qr.p, 1);
                long t = - bit.sum(qr.p - 1) + qr.a * bitNum.sum(qr.p - 1)
                         + bit.sum(qr.p + 1, updateN - 1) - qr.a * bitNum.sum(qr.p + 1, updateN - 1);
                min += Math.abs(minA - qr.a);
                if (t < min || t == min && qr.a < minA) {
                    min = t;
                    minA = qr.a;
                }
            } else {
                sb.append(minA).append(' ').append(min + bSum).append('\n');
            }
        }
        out.print(sb.toString());
    }
}

class Query implements Comparable<Query> {
    int type, p;
    long a, b;
    Query(int type, int a, int b) {
        this.type = type;
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Query query) {
        return Long.compare(a, query.a);
    }
}

class BIT{
    int n;
    long[] bit;
    public BIT(int n){
        this.n = n;
        bit = new long[n+1];
    }

    void add(int idx, long val){
        for(int i=idx+1; i<=n; i+=i&(-i)) bit[i-1] += val;
    }

    long sum(int idx){
        long res = 0;
        for(int i=idx+1; i>0; i-=i&(-i)) res += bit[i-1];
        return res;
    }

    long sum(int begin, int end){
        if (begin > end) return 0;
        if(begin == 0) return sum(end);
        return sum(end)-sum(begin-1);
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