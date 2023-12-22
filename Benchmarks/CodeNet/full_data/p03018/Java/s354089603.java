
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            String s = sc.next();
            int count = 0;
            class Candidate {
                int index;
                boolean isLeft;
                public Candidate(int index, boolean isLeft) {
                    this.index = index;
                    this.isLeft = isLeft;
                }
            }
            Queue<Candidate> candidates = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder(s);
            for (int i = 2; i < s.length(); i++) {
                if (s.charAt(i-2) == 'A' &&
                        s.charAt(i-1) == 'B' &&
                        s.charAt(i) == 'C') {
                    sb.setCharAt(i-2, 'B');
                    sb.setCharAt(i-1, 'C');
                    sb.setCharAt(i, 'A');
                    count ++;
                    if (i < s.length() - 2)
                        candidates.add(new Candidate(i, false));
                    if (i > 2)
                        candidates.add(new Candidate(i-3, true));
                }
            }
            s = sb.toString();
            while(candidates.size() > 0) {
                Candidate c = candidates.poll();
                int index = c.index;
                if (s.substring(index, index + 3).equals("ABC")) {
                    StringBuilder sb2 = new StringBuilder(s);
                    sb2.setCharAt(index, 'B');
                    sb2.setCharAt(index+1, 'C');
                    sb2.setCharAt(index+2, 'A');
                    s = sb2.toString();
                    count ++;
                    if (index < s.length()-4 && !c.isLeft)
                        candidates.add(new Candidate(index+2, false));
                    if (index > 0 && c.isLeft)
                        candidates.add(new Candidate(index-1, true));
                }
            }
            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}