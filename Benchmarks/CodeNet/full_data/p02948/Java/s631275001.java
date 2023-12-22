import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner();
        int n, m;
        int[] tmp = scanner.nextIntArray();
        n = tmp[0];
        m = tmp[1] + 1;

        ArrayList<Job> j = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tmp = scanner.nextIntArray();
            int a = tmp[0];
            int b = tmp[1];
            if (1 + a > m)
                continue;
            j.add(new Job(a, b));
        }

        Collections.sort(j, Collections.reverseOrder());
        // System.out.println(j);
        long tot = 0;
        int c = 0;
        for (int i = 1; i <= m; i++) {
            while (c < j.size() && i + j.get(c).delay > m)
                c++;
            if (c >= j.size())
                break;
            // System.out.println(j.get(c));
            tot += j.get(c).reward;
            c++;
        }
        System.out.println(tot);
    }

    public static class Job implements Comparable<Job> {
        int delay, reward;
        public Job(int delay, int reward) {
            this.delay = delay;
            this.reward = reward;
        }
        @Override
        public int compareTo(Job other) {
            if (this.reward < other.reward)
                return -1;
            if (this.reward > other.reward)
                return 1;
            else {
                if (this.delay < other.delay)
                    return -1;
                else if (this.delay > other.delay)
                    return 1;
                else return 0;
            }
        }
        @Override
        public String toString() {
            return this.delay + " " + this.reward;
        }
    }

    private static class FastScanner {
        private BufferedReader br;

        public FastScanner() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastScanner(String input) throws Exception { br = new BufferedReader(new FileReader(input)); }
        public int[] nextIntArray() throws IOException {
            String line = br.readLine();
            String[] strings = line.trim().split("\\s+");
            int[] array = new int[strings.length];
            for (int i = 0; i < array.length; i++)
                array[i] = Integer.parseInt(strings[i]);
            return array;
        }
        public int nextInt() throws IOException { return Integer.parseInt(br.readLine()); }
        public long[] nextLongArray() throws IOException {
            String line = br.readLine();
            String[] strings = line.trim().split("\\s+");
            long[] array = new long[strings.length];
            for (int i = 0; i < array.length; i++)
                array[i] = Long.parseLong(strings[i]);
            return array;
        }
        public ArrayList<Integer> nextIntegerArrayList() throws IOException {
            String line = br.readLine();
            String[] strings = line.trim().split("\\s+");
            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int i = 0; i < strings.length; i++)
                array.add(Integer.parseInt(strings[i]));
            return array;
        }
        public ArrayList<Long> nextLongArrayList() throws IOException {
            String line = br.readLine();
            String[] strings = line.trim().split("\\s+");
            ArrayList<Long> array = new ArrayList<Long>();
            for (int i = 0; i < strings.length; i++)
                array.add(Long.parseLong(strings[i]));
            return array;
        }
        public long nextLong() throws IOException { return Long.parseLong(br.readLine()); }
        public double nextDouble() throws IOException { return Double.parseDouble(br.readLine()); }
        public String nextLine() throws IOException { return br.readLine(); }


        public ArrayList<BigInteger> nextBigIntegers() throws IOException {
            String line = br.readLine();
            String[] strings = line.trim().split("\\s+");
            ArrayList<BigInteger> array = new ArrayList<BigInteger>();
            for (int i = 0; i < strings.length; i++)
                array.add(BigInteger.valueOf(Long.valueOf(strings[i])));
            return array;
        }
    }
}