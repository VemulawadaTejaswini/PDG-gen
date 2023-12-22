import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main implements Runnable {
    static ContestScanner in;
    static Writer out;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        Main main = new Main();
        try {
            in = new ContestScanner();
            out = new Writer();
            main.solve();
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void solve() throws IOException {
        int n = in.nextInt();
        List<long[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long[] p = {in.nextInt(), in.nextInt(), i};
            list.add(p);
        }
        // ch.get(last) contains first
        List<long[]> ch = convexHull(list);
        double[] ans = new double[n];

        for (int i = 0; i < ch.size(); i++) {
            long[] p = ch.get(i);
            long[] pre = ch.get((i - 1 + ch.size()) % ch.size());
            long[] post = ch.get((i + 1 + ch.size()) % ch.size());
            long x1 = pre[0] - p[0];
            long y1 = pre[1] - p[1];
            long x2 = post[0] - p[0];
            long y2 = post[1] - p[1];
            double a = angle(x1, y1, x2, y2);
            ans[(int)p[2]] = (Math.PI - a) / (Math.PI * 2);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }

    public static List<long[]> convexHull(List<long[]> list){
        int k = 0;
        Collections.sort(list, new Comparator<long[]>(){
            @Override
            public int compare(long[] o1, long[] o2) {
                if(o1[0] != o2[0]) return Long.compare(o1[0], o2[0]);//o1[0]-o2[0];
                return Long.compare(o1[1], o2[1]);//o1[1]-o2[1];
            }
        });
        int n = list.size();
        long[][] qs = new long[n*2][2];
        for(int i=0; i<n; i++){
            while(k > 1 && cross(qs[k-2], qs[k-1], qs[k-1], list.get(i)) < 0) k--;
            qs[k++] = list.get(i);
        }

        for(int i=n-2, t=k; i>=0; i--){
            while(k > t && cross(qs[k-2], qs[k-1], qs[k-1], list.get(i)) < 0) k--;
            qs[k++] = list.get(i);
        }

        List<long[]> res = new ArrayList<>();
        for(int i=0; i<k-1; i++){
            res.add(qs[i]);
        }
        return res;
    }

    public static long cross(long[] p11, long[] p12, long[] p21, long[] p22){
        return (p12[0]-p11[0])*(p22[1]-p21[1]) - (p22[0]-p21[0])*(p12[1]-p11[1]);
    }

    double angle(double x1, double y1, double x2, double y2){
        double a1 = Math.atan2(y1, x1);
        double a2 = Math.atan2(y2, x2);
        double rad = Math.abs(a1-a2);
        if(rad>Math.PI) rad = 2*Math.PI - rad;
        return rad;
    }
}

@SuppressWarnings("serial")
class MultiSet<T> extends HashMap<T, Integer>{
    @Override public Integer get(Object key){return containsKey(key)?super.get(key):0;}
    public void add(T key,int v){put(key,get(key)+v);}
    public void add(T key){put(key,get(key)+1);}
    public void sub(T key){final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
    public MultiSet<T> merge(MultiSet<T> set)
    {MultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
        for(Entry<T,Integer>e:s.entrySet())l.add(e.getKey(),e.getValue());return l;}
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