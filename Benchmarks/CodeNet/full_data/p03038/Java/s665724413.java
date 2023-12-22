import java.io.IOException;
import java.io.InputStream;
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
}

class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int cardNum = Integer.parseInt(sc.next());
        int calcNum = Integer.parseInt(sc.next());

        int[] cards = new int[cardNum];
        for (int i = 0; i < cardNum; i++) {
            cards[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < calcNum; i++) {
            int chaNum = Integer.parseInt(sc.next());
            int nuint = Integer.parseInt(sc.next());

            for(int j = 0; j < chaNum; j++) {
                int minpos = 0;
                int min = cards[0];
                for (int x = 1; x < cardNum; x++) {
                    if(min > cards[x]) {
                        min = cards[x];
                        minpos = x;
                    }
                }
                if(cards[minpos] < nuint) cards[minpos] = nuint;
            }
        }

        long max = 0;
        for (int i = 0; i < cardNum; i++) {
            max = max + cards[i];
        }
        System.out.println(max);
    }
}