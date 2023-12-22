import java.util.*;
import java.io.*;

public class Main {
    void solve() {
        int a=ni(),b=ni();
        char ch1='.',ch2='#';
        if(a>b){
            int t=a; a=b; b=t;
            ch1='#'; ch2='.';
        }
        s=new char[101][101];
        for(int i=0;i<=100;i++) Arrays.fill(s[i],ch1);
        int idi=-1,idj=-1;

       out: for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j+=2){
                a--;
                s[i][j]=ch2;
                if(a==0){
                    idi=i;
                    idj=j;
                    break out;
                }

            }
        }

        b-=((idi-1)*50);
        b--;

        for(int j=1;j<idj;j++) {
                s[idi+1][j]=ch2;
        }
       out: for(int i=idi+3;i<=100;i+=2){
            for(int j=1;j<=100;j+=2){
                if(b==0) break out;
                b--;

                s[i][j]=ch2;
                if(b==0)break out;
            }
        }
        pw.println("100 100");
        for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j++) pw.print(s[i][j]);
            pw.println("");
        }
//        int ca=0,cb=0;
//        vis=new boolean[101][101];
//        for(int i=1;i<=100;i++){
//            for(int j=1;j<=100;j++){
//                if(!vis[i][j] && s[i][j]=='.'){
//                    cc++;
//                    dfs(i,j,'.');
//                }
//            }
//        }
//        ca=cc;
//        cc=0;
//        for(int i=1;i<=100;i++) Arrays.fill(vis,false);
//        for(int i=1;i<=100;i++){
//            for(int j=1;j<=100;j++){
//                if(!vis[i][j] && s[i][j]=='#'){
//                    cc++;
//                    dfs(i,j,'#');
//                }
//            }
//        }
//        cb=cc;
//        pw.println(ca+" "+cb);

    }
    char s[][];
    int dx[]={-1,0,1,0};
    int dy[]={0,1,0,-1};
    int cc=0;
    boolean vis[][];
    void dfs(int x,int y,char ch){
        pw.println(x+" "+y);
        vis[x][y]=true;
        for(int i=0;i<4;i++){
            int vx=x+dx[i],vy=y+dy[i];
            if(isValid(vx,vy) && !vis[vx][vy] && s[vx][vy]==ch) dfs(vx,vy,ch);
        }
    }
    boolean isValid(int x,int y){
        return(x>=1 && x<=100 && y>=1 && y<=100);
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