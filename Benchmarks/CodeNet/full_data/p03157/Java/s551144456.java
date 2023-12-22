
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class Main implements Runnable {
    public static int h;
    public static int w;
    public static boolean[][] map;
    public static int[][] root;

    public static void main(String[] args)throws Exception{
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    public void run() {
        FastScanner sc = new FastScanner();


        w = sc.nextInt();
        h = sc.nextInt();

        map = new boolean[w][h];

        for(int i = 0;i < w;i ++){ //map を　格納
            String temp = sc.next();
            for(int j = 0;j < h;j ++){
                map[i][j] = temp.charAt(j)=='#';
            }
        }


        root = new int[w][h];
        int rootcount = 1;

        for(int i = 0;i < w;i ++){
            for(int j = 0;j < h;j ++){
                if(root[i][j] != 0){
                    continue;
                }
                root[i][j] = rootcount;
                rootCheck(i,j);
                rootcount++;

            }
        }

//
//        for(int i = 0;i < w;i++){//現在の2次元配列表示プログラム
//            for(int j = 0;j < h;j++) {
//                System.out.print(root[i][j] + " ");
//                if (j == h - 1)
//                    System.out.println("");
//            }
//        }

        int ans =0;
        for(int i = 0;i < rootcount;i ++){
            int black = 0;
            int white = 0;
            for(int j = 0;j < w;j ++){
                for(int k = 0;k < h;k ++){

                    if (root[j][k] == i){
                        if(map[j][k]){
                            black ++;
                        }else{
                            white ++;
                        }
                    }

                }
            }
            ans += black * white;
        }

        System.out.println(ans);



    }
    static void rootCheck(int i,int j){
        //上
        if(i != 0) {
            if (root[i - 1][j] == 0 && (map[i][j] != map[i-1][j])){
                root[i - 1][j] = root[i][j];
                rootCheck(i-1,j);
            }
        }
        //右
        if(j != h-1) {
            if (root[i][j + 1] == 0 && (map[i][j] != map[i][j + 1])){
                root[i][j + 1] = root[i][j];
                rootCheck(i,j+1);
            }
        }
        //下
        if(i != w-1) {
            if (root[i + 1][j] == 0 && (map[i][j] != map[i + 1][j])){
                root[i + 1][j] = root[i][j];
                rootCheck(i + 1,j);
            }
        }
        //左
        if(j != 0) {
            if (root[i][j - 1] == 0 && (map[i][j] != map[i][j - 1])){
                root[i][j - 1] = root[i][j];
                rootCheck(i,j-1);
            }
        }
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