
import java.util.*;
import java.io.*;

public class Main{
    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	String[] a = new String[h];
    	for(int i=0;i<h;i++){
    		a[i] = sc.next();
    	}
    	int[] dx = {0,1};
    	int[] dy = {1,0};
    	ArrayList<Point> now = new ArrayList<Point>();
    	ArrayList<Point> next = new ArrayList<Point>();
    	boolean[][] map = new boolean[w][h];
    	for(int i=0;i<w;i++){
    		Arrays.fill(map[i],true);
    	}
    	if(a[0].charAt(0)=='#'){
    		Point pp = new Point(0,0);
    		now.add(pp);
    		map[0][0] = false;
    	}
    	boolean flag = false;
        int count = 0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(a[i].charAt(j)=='#'){
                    count++;
                }
            }
        }
        if(count==h+w-1){
    	while(now.size()!=0){
    		for(int i=0;i<now.size();i++){
    			Point p = now.get(i);
    			//out.println(p.x+" "+p.y);
    			if(p.x==w-1 && p.y==h-1){
                    //out.println("a");
    				flag = true;
    				break;
    			}
    			for(int j=0;j<2;j++){
    				if(dx[j]+p.x==w || dy[j]+p.y==h){
    					continue;
    				}
    				if(a[dy[j]+p.y].charAt(dx[j]+p.x) == '#' && map[dx[j]+p.x][dy[j]+p.y]){
    					Point point = new Point(dx[j]+p.x,dy[j]+p.y);
    					next.add(point);
    					map[dx[j]+p.x][dy[j]+p.y] = false;
    				}
    			}
    		}
    		if(flag){
    			break;
    		}
    		now.clear();
    		for(int i=0;i<next.size();i++){
    			now.add(next.get(i));
    		}
    		next.clear();
    	}
        }
    	if(flag){
    		out.println("Possible");
    	}
    	else{
    		out.println("Impossible");
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