import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Stack;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null,new Main(), "" ,Runtime.getRuntime().maxMemory()).start();
    }

    public void run() {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, List<Integer>> friendMap = new HashMap<>();
        Map<Integer, List<Integer>> enemyMap = new HashMap<>();
        boolean[][] isFriend = new boolean[n][n];
        boolean[][] isEnemy = new boolean[n][n];
        int[] numFriendOf = new int[n];
        for(int i = 0;i < m;i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            numFriendOf[a]++;
            numFriendOf[b]++;
            List<Integer> fMap = friendMap.get(Integer.valueOf(a));
            if(fMap == null) {
                fMap = new ArrayList<>();
                fMap.add(Integer.valueOf(b));
            }
            else fMap.add(Integer.valueOf(b));
            friendMap.put(Integer.valueOf(a), fMap);
            
            fMap = friendMap.get(Integer.valueOf(b));
            if(fMap == null) {
                fMap = new ArrayList<>();
                fMap.add(Integer.valueOf(a));
            }
            else fMap.add(Integer.valueOf(a));
            friendMap.put(Integer.valueOf(b), fMap);
        }
        for(int i = 0;i < k;i++) {
            int c = sc.nextInt() - 1;
            int d = sc.nextInt() - 1;
            List<Integer> eMap = enemyMap.get(Integer.valueOf(c));
            if(eMap == null) {
                eMap = new ArrayList<>();
                eMap.add(Integer.valueOf(d));
            }
            else eMap.add(Integer.valueOf(d));
            enemyMap.put(Integer.valueOf(c), eMap);
            
            eMap = enemyMap.get(Integer.valueOf(d));
            if(eMap == null) {
                eMap = new ArrayList<>();
                eMap.add(Integer.valueOf(c));
            }
            else eMap.add(Integer.valueOf(c));
            enemyMap.put(Integer.valueOf(d), eMap);
        }

        boolean[] isChecked = new boolean[n];
        Map<Integer, Integer> candidate = new HashMap<>();
        Set<Integer> friendNet = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        int[] netIdx = new int[n];
        Arrays.fill(netIdx, -1);
        int net = -1;
        for(int i = 0;i < n;i++) {
            if(isChecked[i]) continue;
            friendNet.clear();
            stack.setSize(0);
            stack.push(Integer.valueOf(i));
            friendNet.add(Integer.valueOf(i));
            isChecked[i] = true;
            net++;
            netIdx[Integer.valueOf(i)] = net;
            while(!stack.isEmpty()) {
                Integer start = stack.pop();
                List<Integer> friends = friendMap.get(start);
                if(friends == null) continue;
                for(int j = 0;j < friends.size();j++) {
                    if(isChecked[friends.get(j).intValue()]) continue;
                    friendNet.add(friends.get(j));
                    isChecked[friends.get(j).intValue()] = true;
                    stack.push(friends.get(j));
                    netIdx[friends.get(j).intValue()] = net;
                }
            }
            
            for(Integer j : friendNet) {
                int candidateNum = friendNet.size() - 1 - numFriendOf[j.intValue()];
                List<Integer> enemy = enemyMap.get(j);
                if(enemy != null) {
                    for(Integer e : enemy) {
                        if(netIdx[j.intValue()] == netIdx[e.intValue()]) candidateNum--;
                    }
                }
                
                candidate.put(Integer.valueOf(j), candidateNum);
            }
        }
        

        PrintWriter out =  new PrintWriter(System.out);
        for(int i = 0;i < n;i++) {
            out.print(candidate.get(Integer.valueOf(i)));
            if(i != n - 1) out.print(" ");
        }
        out.println();
        out.flush();
    }

    long nCm(int n, int m) {
        if(n < m) return 0l;
        long c = 1;
        m = (n - m < m ? n - m : m);
        for(int ns = n - m + 1, ms = 1;ms <= m;ns ++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
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