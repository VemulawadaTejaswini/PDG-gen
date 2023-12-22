import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Reader r = new Reader(System.in)) {
            int N = r.i();
            int[] A = r.ia();
            int[] B = r.ia();

            {
                int[] A2 = Arrays.copyOf(A, N);
                int[] B2 = Arrays.copyOf(B, N);
                Arrays.sort(A2);
                Arrays.sort(B2);

                for (int i = 0; i < N; i++) {
                    if (A2[i] > B2[i]) {
                        System.out.println("No");
                        return;
                    }
                }
            }

            int C = 0;
            int m = -1;
            for (int i = 0; i < N; i++) {
                if (A[i] > B[i]) {
                    C++;
                } else {
                    m = i;
                }
            }

            if (C <= N - 2) {
                System.out.println("Yes");
                return;
            } else if (C == N) {
                System.out.println("No");
                return;
            }

            int[] A2 = new int[N - 1];
            int[] B2 = new int[N - 1];

            System.arraycopy(A, 0, A2, 0, m);
            System.arraycopy(B, 0, B2, 0, m);
            if (N - 1 - m > 0) {
                System.arraycopy(A, m + 1, A2, m, N - 1 - m);
                System.arraycopy(B, m + 1, B2, m, N - 1 - m);
            }
            Arrays.sort(A2);
            Arrays.sort(B2);

            for (int i = 0; i < N - 1; i++) {
                if (A2[i] > B2[i]) {
                    System.out.println("No");
                    return;
                }
            }

            System.out.println("Yes");
        }
    }

    public static class Reader implements AutoCloseable {

        private BufferedReader br;

        private String[] buf;

        private int bufidx = -1;

        public Reader(InputStream in) {
            this.br = new BufferedReader(new InputStreamReader(in));
        }

        @Override
        public void close() throws Exception {
            br.close();
        }

        private void readBuf() throws IOException {
            if (bufidx == -1 || bufidx == buf.length) {
                buf = br.readLine().split(" ");
                bufidx = 0;
            }
        }

        public String s() throws IOException {
            readBuf();
            return buf[bufidx++];
        }

        public int i() throws IOException {
            return Integer.parseInt(s());
        }

        public long l() throws IOException {
            return Long.parseLong(s());
        }

        public double d() throws IOException {
            return Double.parseDouble(s());
        }

        public String[] sa() throws IOException {
            readBuf();
            if (bufidx != 0) {
                throw new RuntimeException("illegal read");
            }
            bufidx = -1;
            return buf;
        }

        public int[] ia() throws IOException {
            String[] sa = sa();
            int[] ia = new int[sa.length];
            for (int i = 0; i < sa.length; i++) {
                ia[i] = Integer.parseInt(sa[i]);
            }
            return ia;
        }

        public long[] la() throws IOException {
            String[] sa = sa();
            long[] la = new long[sa.length];
            for (int i = 0; i < sa.length; i++) {
                la[i] = Long.parseLong(sa[i]);
            }
            return la;
        }

        public double[] da() throws IOException {
            String[] sa = sa();
            double[] da = new double[sa.length];
            for (int i = 0; i < sa.length; i++) {
                da[i] = Double.parseDouble(sa[i]);
            }
            return da;
        }

        public int[][] im(int N) throws IOException {
            int[][] im = new int[N][];
            for (int i = 0; i < N; i++) {
                im[i] = ia();
            }
            return im;
        }

        public long[][] lm(int N) throws IOException {
            long[][] lm = new long[N][];
            for (int i = 0; i < N; i++) {
                lm[i] = la();
            }
            return lm;
        }

        public double[][] dm(int N) throws IOException {
            double[][] dm = new double[N][];
            for (int i = 0; i < N; i++) {
                dm[i] = da();
            }
            return dm;
        }

    }

}
