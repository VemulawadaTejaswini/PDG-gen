import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static Task[] t;
    public static void main(String[] args) {
        N = sc.nextInt();
        t = new Task[N];
        for(int i=0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            t[i] = new Task(a,b);
        }
        Arrays.sort(t);
        boolean ans = true;
        int last = t[0].due;
        for(int i=0; i < N; i++) {
            Task task = t[i];
            int w = t[i].work;
            int d = t[i].due;
            int s = t[i].start;
            // writer.print(w);
            // writer.print(", ");
            // writer.print(d);
            // writer.print(", ");
            // writer.print(s);
            // writer.print(", ");
            // writer.print(last);
            // writer.print(", ");
            // writer.println();
            if(last - w < 0 || s < 0) {
                ans = false;
                break;
            } else {
                last = Math.min(last,d) - w;
            }
        }
        if (ans) {
            writer.println("Yes");
        } else {
            writer.println("No");
        }
        writer.flush();
    }

    public static class Task implements Comparable<Task>{
        public int work;
        public int due;
        public int start;
        public Task(int work, int due) {
            this.work = work;
            this.due = due;
            this.start = due - work;
        }

        public int compareTo(Task y) {
            if ((y.due - this.due) != 0) {
                return(y.due - this.due);
            }
            return(y.start - this.start);
        }
    }

    static final FastScanner sc = new FastScanner(System.in);
    static PrintWriter writer = new PrintWriter(System.out);

    static class FastScanner {
        Reader input;
 
        FastScanner() {
            this(System.in);
        }
 
        FastScanner(InputStream stream) {
            this.input = new BufferedReader(new InputStreamReader(stream));
        }
 
        int nextInt() {
            return (int) nextLong();
        }
 
        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
 
        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }
 
        char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
 
        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
    }
    //FAST SCANNER END HERE
}
