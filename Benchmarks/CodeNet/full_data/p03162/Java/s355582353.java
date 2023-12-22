import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;
class Main {
    //static {
      //  try {
        //    System.setOut(new PrintStream(new File("output.txt")));
          //  new File("input.txt").createNewFile();
            //System.setIn(new FileInputStream(new File("input.txt")));
        //} catch (Exception e) {
          //  e.printStackTrace();
        //}
    //}
    static FastReader fastReader = new FastReader();
    static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) throws Exception {
        try {
            // int testCases = fastReader.nextInt();
            int testCases = 1;

            while (testCases-- > 0) {
                int n = fastReader.nextInt();
                Triple triples[] = new Triple[n];
                Comparator<Triple> comp = new Comparator<Main.Triple>() {
                    @Override
                    public int compare(Triple o1, Triple o2) {
                        return o2.getMaxVal() - o1.getMaxVal();
                    }
                };
                TreeSet<Triple> treeSet = new TreeSet<>();
                for (int i = 0; i < n; i++) {
                    int a = fastReader.nextInt();
                    int b = fastReader.nextInt();
                    int c = fastReader.nextInt();
                    triples[i] = new Triple(a, b, c, i);
                    treeSet.add(triples[i]);
                }
                // System.out.println(treeSet);
                long ans = 0;
                while (!treeSet.isEmpty()) {
                    Triple t = treeSet.pollFirst();
                    ans += t.getMaxVal();
                    if (t.day - 1 >= 0) {
                        Triple t2 = triples[t.day - 1];
                        if (treeSet.remove(t2)) {
                            int index = t.getMaxIndex();
                            if (index == 0)
                                t2.a = 0;
                            else if (index == 1)
                                t2.b = 0;
                            else
                                t2.c = 0;
                            treeSet.add(t2);
                        }
                    }
                    if (t.day + 1 < n) {
                        Triple t2 = triples[t.day + 1];
                        if (treeSet.remove(t2)) {
                            int index = t.getMaxIndex();
                            if (index == 0)
                                t2.a = 0;
                            else if (index == 1)
                                t2.b = 0;
                            else
                                t2.c = 0;
                            treeSet.add(t2);
                        }
                    }
                    // System.out.println(treeSet);
                }
                System.out.println(ans);
            }
            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.flush();
        } catch (Exception e) {
            return;
        }
    }

    static class Triple implements Comparable<Triple> {
        int a, b, c, day;

        public Triple(int x, int y, int z, int d) {
            a = x;
            b = y;
            c = z;
            day = d;
        }

        @Override
        public String toString() {
            return day + ":(" + a + "," + b + "," + c + ")";
        }

        int getMaxIndex() {
            int max = Math.max(a, Math.max(b, c));
            if (max == a)
                return 0;
            if (max == b)
                return 1;
            return 2;
        }

        int getMaxVal() {
            return Math.max(a, Math.max(b, c));
        }

        @Override
        public int compareTo(Triple o) {
            if (this.getMaxVal() - o.getMaxVal() == 0)
                return this.day - o.day;
            return o.getMaxVal() - this.getMaxVal();
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}