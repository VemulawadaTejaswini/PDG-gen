import java.util.*;
import java.io.*;

public class Main implements Runnable {
    static int ac;
    static int wa;
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        // keep stack
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    public void run() {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, Score> scores = new HashMap<Integer, Score>(N);
        ac = 0;
        wa = 0;
        for(int i = 0; i < M; i++) {
            int p = sc.nextInt();
            String S = sc.next();
            Score score;
            if (scores.containsKey(p)) {
                score = scores.get(p);
                if(score.isAC()) {
                    continue;
                }
                if (S.equals("AC")) {
                    ac++;
                    wa += score.getWA();
                }
                score.update(S);
                scores.put(p, score);
            } else {
                score = new Score(S);                
                scores.put(p, score);
                if (S.equals("AC")) {
                    ac++;
                }
            }
        }

        out.printf("%d %d\n", ac, wa);
        out.flush();
    }
}

class Score {
    String score;
    int wa_count;
    Score(String in_score) {
        score = "WA";
        wa_count = 0;
        update(in_score);
    }
    public boolean isAC() {
        if(score.equals("AC")) {
            return true;
        }
        return false;
    }
    public int getWA() {
        return wa_count;
    }
    public void update(String in_score) {
        if (score.equals("AC")) {
            return;
        }
        if (in_score.equals("AC")) {
            score = in_score;
        } else {
            wa_count++;
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
        } else {
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

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        }
        else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}