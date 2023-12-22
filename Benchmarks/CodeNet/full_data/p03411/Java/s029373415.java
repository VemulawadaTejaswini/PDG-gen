import java.util.*;
import java.io.*;

public class Main {
class Node implements Comparable<Node> {
    int x;
    int y;
    public Node(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Node c){
        int t=Integer.compare(this.x,c.x);
        if(t!=0) return t;
        t=Integer.compare(this.y,c.y);
        return t;
    }
}
    void solve(){
        int n=ni();

        Node p1[]=new Node[n];
        Node p2[]=new Node[n];
        for(int i=0;i<n;i++) {
                p1[i]=new Node(ni(),ni());
        }
        for(int i=0;i<n;i++) {
            p2[i]=new Node(ni(),ni());
        }
        Arrays.sort(p1);
        Arrays.sort(p2);

        PriorityQueue<Node> q=new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node t1, Node t2) {
                return Integer.compare(t1.y,t2.y);
            }
        });

        for(int j=0;j<n;j++){
            int cc=0;
            for(int i=0;i<n;i++) {
                if(p1[i].x<p2[j].x && p1[i].y<p2[j].y){
                    cc++;
                }
            }
            q.offer(new Node(j,cc));
        }
        boolean taken[]=new boolean[n];
        int ans=0;
        while(!q.isEmpty()){
             Node p=q.poll();
             int j=p.x;

             for(int i=0;i<n;i++){
                 if(taken[i]) continue;
                 if(p1[i].x<p2[j].x && p1[i].y<p2[j].y){
                     taken[i]=true;
                     ans++;

                     break;
                 }
             }

        }
        pw.println(ans);


    }


    long M=(long)1e9+7;
    InputStream is;
    PrintWriter pw;
    String INPUT = "";
    void run() throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        pw = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        pw.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }

    public static void main(String[] args) throws Exception { new Main().run(); }

    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;

    private int readByte() {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }

    private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }

    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }

    private String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private void tr(Object... o) { if(INPUT.length() > 0)System.out.println(Arrays.deepToString(o)); }
} 