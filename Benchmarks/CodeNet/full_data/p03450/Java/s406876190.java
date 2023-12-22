import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
    static final int MAX = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws Exception{
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int m = fs.nextInt();
        HashMap<Integer, Integer>[] d = new HashMap[n+1];
        for (int i = 0; i <= n; i++) {
            d[i] = new HashMap<Integer, Integer>();
        }
        
        for (int i = 0; i < m; i++) {
            int xLi = fs.nextInt();
            int xRi = fs.nextInt();
            int xDi = fs.nextInt();
            d[xLi].put(xRi, xDi);
            d[xRi].put(xLi, -xDi);
        }

        Queue<Integer> q = new LinkedList<Integer>();
        int[] pos = new int[n+1];
        Arrays.fill(pos, MAX);
        
        for (int i = 1; i <= n; i++) {
            if (pos[i] != MAX) continue;
            
            q.add(i);
            pos[i] = 0;
            while (!q.isEmpty()) {
                int f = q.poll();
                for (Integer k : d[f].keySet()) {
                    Integer vFK = d[f].get(k);
                    
                    if (pos[k] != MAX) {
                        if (pos[k] != pos[f] + vFK) {
                            System.out.println("No");
                            return;
                        }
                    } else {
                        q.add(k);
                        pos[k] = pos[f] + vFK;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
    
    static class FastScanner {
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
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
        public int nextInt() {
            if (!hasNext()) throw new NoSuchElementException();
            int n = 0;
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
    }
}
