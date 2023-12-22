import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

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

public class Main {
    private static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        func();
        pw.flush();
        return;
    }

    static void func() throws IOException {
    	FastScanner fs = new FastScanner();
        //int[] in = arrayOfInt();
        //int n = in[0];
        //int m = in[1];
        int n = fs.nextInt();
        int m = fs.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] pinput = new int[m];
        int[] yinput = new int[m];
        for(int i = 0;i < m;i++){
            //int[] ini = arrayOfInt();
            //int p = ini[0];
            //int y = ini[1];
            int p = fs.nextInt();
            int y = fs.nextInt();
            if(!map.containsKey(p)){
                List<Integer> list = new ArrayList<>();
                map.put(p, list);
            }
            map.get(p).add(y);
            pinput[i] = p;
            yinput[i] = y;
        }

        Map<Integer, Map<Integer, Integer>> newMap = new HashMap<>();
        for(Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            e.getValue().sort(Comparator.naturalOrder());
            Map<Integer, Integer> valMap = new HashMap<>();
            for(int i = 0;i < e.getValue().size();i++){
                valMap.put(e.getValue().get(i),i);
            }
            newMap.put(e.getKey(), valMap);
        }


        for(int i = 0;i < m;i++){
            String p = String.format("%06d", pinput[i]);
            String y = String.format("%06d", newMap.get(pinput[i]).get(yinput[i])+1);
            println(p + y);
        }
    }

    // 出力
    static void println(Object val){pw.println(val);}
}
