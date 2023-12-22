import java.io.*;
import java.util.*;

public class Main {
    static int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        int w = sc.nextInt();

        boolean[][] a = new boolean[h+2][w+2];
        ArrayDeque<Integer[]> que1 = new ArrayDeque<Integer[]>(1100);
        ArrayDeque<Integer[]> que2 = new ArrayDeque<Integer[]>(1100);
        for(int i=0; i<h; i++){
            String s = sc.next();
            for(int j=0; j<w; j++){
                if(s.charAt(j) == '#'){
                    a[i+1][j+1] = true;
                    que1.add(new Integer[]{i+1, j+1});
                }else{
                    a[i+1][j+1] = false;
                }
            }
        }

        for(int i=0; i<h+2; i++){
            a[i][0] = true;
            a[i][w+1] = true;
        }
        for(int i=0; i<w+2; i++){
            a[0][i] = true;
            a[h+1][i] = true;
        }
        
        if(que1.size() == h*w){
            System.out.println(0);
            return;
        }

        int count = 0;
        while(true){
            if(count % 2 == 0){
                if(que1.size()== 0){
                    break;
                }
                while(que1.size() != 0){
                    Integer[] next = que1.pollLast();
                    for(int i=0; i<4; i++){
                        int nx = next[0] + dir[i][0];
                        int ny = next[1] + dir[i][1];
                        if(!a[nx][ny]){
                            a[nx][ny] = true;
                            que2.add(new Integer[]{nx, ny});
                        }
                    }
                }
            }else{
                if(que2.size()== 0){
                    break;
                }
                while(que2.size() != 0){
                    Integer[] next = que2.pollLast();
                    for(int i=0; i<4; i++){
                        int nx = next[0] + dir[i][0];
                        int ny = next[1] + dir[i][1];
                        if(!a[nx][ny]){
                            a[nx][ny] = true;
                            que1.add(new Integer[]{nx, ny});
                        }
                    }
                }
            }
            count++;
            if(count > 2500) break;
        }
        System.out.println(count-1);
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