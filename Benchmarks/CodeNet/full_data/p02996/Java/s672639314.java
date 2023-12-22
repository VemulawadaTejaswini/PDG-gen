import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        Job[] a = new Job[n];
        for(int i=0;i<n;i++) {
            a[i] = new Job(sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(a);

        long cur = 0;
        for(int i=0;i<n;i++) {
            if(a[i].dur + cur > a[i].t) {
                pw.println("No");
                pw.close();
                return;
            }
            cur += a[i].dur;
        }

        pw.println("Yes");
        pw.close();
    }

    static class Job implements Comparable<Job> {
        long dur;
        long t;
        public Job(long dur, long t) {
            this.dur = dur;
            this.t = t;
        }
        @Override
        public int compareTo(Job other) {
            return (int)(this.t - other.t);
        }

    }
}