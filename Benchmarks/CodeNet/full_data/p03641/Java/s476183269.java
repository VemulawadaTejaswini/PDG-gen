import java.io.*;
import java.math.BigInteger;
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

    RangeMinimumSegTreeIMax[] st;
    void solve() throws IOException {
        int n = in.nextInt();
        int[] p = new int[n];
        st = new RangeMinimumSegTreeIMax[2];
        st[0] = new RangeMinimumSegTreeIMax(n / 2);
        st[1] = new RangeMinimumSegTreeIMax(n / 2);
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
            st[i % 2].set(i / 2, p[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int v: dfs(0, n - 1)) {
            sb.append(v).append(" ");
        }
        out.println(sb.toString().trim());
    }

    Queue<Integer> dfs(int left, int right) {
        final int s = left % 2;
        final int lv = st[s].min(left / 2, right / 2 - s);
        final int lid = st[s].preIdx * 2 + s;
        final int rv = st[1 - s].min((lid + s) / 2, (right) / 2);
        final int rid = st[1 - s].preIdx * 2 + 1 - s;
        Queue<Integer> qu = new ArrayDeque<>();
        qu.add(lv); qu.add(rv);
        List<Queue<Integer>> list = new ArrayList<>();
        if (left < lid) list.add(dfs(left, lid - 1));
        if (rid < right) list.add(dfs(rid + 1, right));
        if (lid + 1 < rid) list.add(dfs(lid + 1, rid - 1));
        while (!list.isEmpty()) {
            int minId = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < list.size(); i++) {
                int v = list.get(i).peek();
                if (v < min) {
                    minId = i;
                    min = v;
                }
            }
            Queue<Integer> minQu = list.get(minId);
            qu.add(minQu.poll()); qu.add(minQu.poll());
            if (minQu.isEmpty()) list.remove(minQu);
        }
        return qu;
    }
}

class RangeMinimumSegTreeIMax {
    int[] tree;
    int[] idx;
    int size;
    int len;
    int n;
    public RangeMinimumSegTreeIMax(int n){
        int beki = 1;
        while(beki < n) beki <<= 1;
        len = beki<<1;
        this.n = n;
        tree = new int[len];
        idx = new int[len];
        size = beki;
        Arrays.fill(tree, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            idx[i | size] = i;
        }
        for (int i = size - 1; i > 0; i--) {
            idx[i] = idx[(i << 1) + 1];
        }
    }
    public void set(int id, int x){
        int i = id | size; tree[i] = x;
        for(i>>=1; i>0; i>>=1) {
            if(tree[i << 1] >= tree[(i << 1) + 1]) {
                tree[i] = tree[(i << 1) + 1];
                idx[i] = idx[(i << 1) + 1];
            } else {
                tree[i] = tree[(i << 1)];
                idx[i] = idx[(i << 1)];
            }
        }
    }
    public int get(int id){
        return tree[id|size];
    }
    // in idx: left to right
    int preIdx;
    public int min(int left, int right){
        int res = Integer.MAX_VALUE;
        preIdx = left;
        left |= size;
        right|= size;
        right++;
        while(left < right){
            if((right&1) == 1) {
                if(tree[--right] <= res) {
                    if(tree[right] != res) preIdx = idx[right];
                    else preIdx = Math.max(preIdx, idx[right]);
                    res = tree[right];
                }
            }
            if((left&1) == 1) {
                if(tree[left] <= res) {
                    if(tree[left] != res) preIdx = idx[left];
                    else preIdx = Math.max(preIdx, idx[left]);
                    res = tree[left];
                }
                left++;
            }
            right >>= 1;
            left >>= 1;
        }
        return res;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int e=2, s=1; e<=len; e<<=1){
            for(;s<e; s++) sb.append(tree[s]).append(" ");
            sb.append("\n");
        }
        return sb.toString();
    }
}

class Writer extends PrintWriter{
    public Writer(String filename)throws IOException
    {super(new BufferedWriter(new FileWriter(filename)));}
    public Writer()throws IOException {super(System.out);}
}
class ContestScanner implements Closeable {
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
