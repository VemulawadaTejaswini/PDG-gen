import java.io.*;
import java.util.*;

/*
TASK: cardgame
LANG: JAVA
 */
class Main{
    static int n , m , k;
    static int[] count;
    static String s;
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner(System.in); //new FileInputStream(new File("cardgame.in")));
        //PrintWriter out = new PrintWriter(new File("cardgame.out"));
        n = in.nextInt();
        m = in.nextInt();
        count = new int[26];
        for(int i = 0;i < n; i++){
            s = in.next();
            for(int j = 0; j < m; j++){
                count[s.charAt(j) - 'a']++;
            }
        }
        if(n % 2 == 0 && m % 2 == 0){
            for(int i = 0; i < 26; i++){
                if(count[i] % 4 != 0){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
        else if(n % 2 == 0 || m % 2 == 0){
            int oddcount = 0;
            for(int i = 0;i < 26; i++){
                if(count[i] % 2 != 0){
                    System.out.println("No");
                    return;
                }
                if(count[i] % 4 != 0)oddcount++;

            }
            if(n % 2 == 0){
                if(oddcount*2 > n){
                    System.out.println("No");
                    return;
                }
            }
            if(m % 2 == 0){
                if(oddcount*2 > m){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
        else {
            int oddcount = 0;
            for(int i = 0; i < 26; i++) {
                if (count[i] % 2 != 0) {
                    oddcount++;
                    count[i]--;
                }
            }
            if(oddcount != 1) System.out.println("No");
            else{
                oddcount = 0;
                for(int i = 0;i < 26; i++){
                    if(count[i] % 2 != 0){
                        System.out.println("No");
                        return;
                    }
                    if(count[i] % 4 != 0)oddcount++;

                }
                if(n % 2 == 0){
                    if(oddcount*2 > n){
                        System.out.println("No");
                        return;
                    }
                }
                if(m % 2 == 0){
                    if(oddcount*2 > m){
                        System.out.println("No");
                        return;
                    }
                }
                System.out.println("Yes");
            }
        }
    }

    private static class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
