
import java.util.*;
import java.io.*;

public class Main{
    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
    	int R = sc.nextInt();
        int C = sc.nextInt();
        int n = sc.nextInt();
        int[] r = new int[n];
        int[] c = new int[n];
        int[] a = new int[n];
        ArrayList<HashMap<Integer,Integer>> maplist = new ArrayList<HashMap<Integer,Integer>>();
        for(int i=0;i<R;i++){
            maplist.add(new HashMap<Integer,Integer>());
        }
        for(int i=0;i<n;i++){
            r[i] = sc.nextInt()-1;
            c[i] = sc.nextInt()-1;
            a[i] = sc.nextInt();
            HashMap<Integer,Integer> mapl = maplist.get(r[i]);
            mapl.put(c[i],a[i]);
        }
        ArrayList<Two> l2 = new ArrayList<Two>();
        ArrayList<ArrayList<One>> l1 = new ArrayList<ArrayList<One>>();
        for(int i=0;i<R;i++){
            ArrayList<One> x = new ArrayList<One>();
            l1.add(x);
        }
        for(int i=0;i<n;i++){
            if(r[i]!=R-1){
                HashMap<Integer,Integer> mapl = maplist.get(r[i]+1);
                if(mapl.containsKey(c[i])){
                    Two t = new Two(r[i],c[i],a[i],r[i]+1,c[i],mapl.get(c[i]));
                    l2.add(t);
                }
                else{
                    ArrayList<One> x = l1.get(r[i]);
                    One o = new One(r[i],c[i],a[i]);
                    x.add(o);
                }
            }
            else{
                ArrayList<One> x = l1.get(R-1);
                One o = new One(r[i],c[i],a[i]);
                x.add(o);
            }
        }
        Point[] ten = new Point[R];
        for(int i=0;i<R;i++){
            ten[i] = new Point(-1,-1);
        }
        boolean flag = true;
        for(int j=0;j<l2.size();j++){
            Two t = l2.get(j);
            //out.println(t.x+" "+t.y+" "+t.z+" "+t.xx+" "+t.yy+" "+t.zz);
            if(ten[t.x].x==-1){
                ArrayList<One> x = l1.get(t.x);
                for(int i=0;i<x.size();i++){
                    One o = x.get(i);
                    if((t.y%2==0 && o.y%2==0) || (t.y%2==1 && o.y%2==1)){
                        if(o.z-t.z+t.zz<0){
                            flag = false;
                        }
                    }
                    else{
                        if(o.z+t.zz-t.z<0){
                            flag = false;
                        }
                    }
                }
                x = l1.get(t.xx);
                for(int i=0;i<x.size();i++){
                    One o = x.get(i);
                    if((t.y%2==0 && o.y%2==0) || (t.y%2==1 && o.y%2==1)){
                        if(t.z-t.zz+o.z<0){
                            flag = false;
                        }
                    }
                    else{
                        if(o.z+t.z-t.zz<0){
                            flag = false;
                        }
                    }   
                }
                Point p = new Point(t.y,t.z-t.zz);
                ten[t.x] = p;
            }
            else{
                if((ten[t.x].x%2==0 && t.y%2==0) || (ten[t.x].x%2==1 && t.y%2==1)){
                    if(ten[t.x].y!=t.z-t.zz){
                        flag = false;
                    }
                }
                else{
                    if(ten[t.x].y!=t.zz-t.z){
                        flag = false;
                    }
                }
            }
            if(!flag){
                break;
            }
        }
        if(flag){
            out.println("Yes");
        }
        else{
            out.println("No");
        }
        out.flush();
        sc.close();
        out.close();
    }

    static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}

class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

class Two{
    int x;
    int y;
    int z;
    int xx;
    int yy;
    int zz;
    Two(int x,int y,int z,int xx,int yy,int zz){
        this.x = x;
        this.y = y;
        this.z = z;
        this.xx = xx;
        this.yy = yy;
        this.zz = zz;
    }
}

class One{
    int x;
    int y;
    int z;
    One(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Reader {

    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public Reader() { this(System.in);}
    public Reader(InputStream source) { this.in = source;}

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try{
            buflen = in.read(buf);
        }catch (IOException e) {e.printStackTrace();}
        if (buflen <= 0) return false;
        return true;
    }

    private int readByte() { if (hasNextByte()) return buf[ptr++]; else return -1;}

    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}

    private void skip() { while(hasNextByte() && !isPrintableChar(buf[ptr])) ptr++;}

    public boolean hasNext() {skip(); return hasNextByte();}

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        boolean minus = false;
        long num = readByte();

        if(num == '-'){
            num = 0;
            minus = true;
        }else if (num < '0' || '9' < num){
            throw new NumberFormatException();
        }else{
            num -= '0';
        }

        while(true){
            int b = readByte();
            if('0' <= b && b <= '9')
                num = num * 10 + (b - '0');
            else if(b == -1 || !isPrintableChar(b))
                return minus ? -num : num;
            else
                throw new NoSuchElementException();
        }
    }

    public int nextInt() {
        long num = nextLong();
        if (num < Integer.MIN_VALUE || Integer.MAX_VALUE < num)
            throw new NumberFormatException();
        return (int)num;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public char nextChar() {
        if (!hasNext()) throw new NoSuchElementException();
        return (char)readByte();
    }

    public String nextLine() {
        while (hasNextByte() && (buf[ptr] == '\n' || buf[ptr] == '\r')) ptr++;
        if (!hasNextByte()) throw new NoSuchElementException();

        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (b != '\n' && b != '\r') {
            sb.appendCodePoint(b);
            b = readByte();
        }

        return sb.toString();
    }

    public int[] nextIntArray(int n) {
        int[] res = new int[n];
        for (int i=0; i<n; i++) res[i] = nextInt();
        return res;
    }

    public char[] nextCharArray(int n) {
        char[] res = new char[n];
        for (int i=0; i<n; i++) res[i] = nextChar();
        return res;
    }

    public void close() {try{ in.close();}catch(IOException e){ e.printStackTrace();}};
}