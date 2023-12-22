import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



class MyComparator implements Comparator {
    @Override
    public int compare (Object arg0, Object arg1) {
        long x = ((Num) arg0).num;
        long y = ((Num) arg1).num;

        if (x < y) {
            return 1;
        } else if (x > y) {
            return -1;
        } else{
            return 0;
        }
    }
}

class Num {
    int idx;
    long num;

    Num(int idx, long num) {
        this.idx = idx;
        this.num = num;
    }
}

public class Main {

    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        long A[] = sc.nextLongArray(N);
        long B[] = sc.nextLongArray(N);

        PriorityQueue pq = new PriorityQueue (N, new MyComparator ());
        for (int i=0;i<N;i++) {
            if (A[i] >= B[i]) continue;

            pq.add(new Num(i, B[i]));
        }

        long ans = 0;
        for (int i=0;i<N;i++) {
            if (A[i] > B[i]) {
                ans = -1;
            }
        }

        if (ans == 0) {
            while (pq.isEmpty() == false) {
                Num tar = (Num) pq.poll();
                int i = tar.idx;
                int b1 = (i - 1 + N) % N;
                int b2 = (i + 1 + N) % N;
                long target = Math.max(A[i], Math.max(B[b1], B[b2]));
                long cnt = Math.max(1, (B[i] - target) / (B[b1] + B[b2]));

//                System.out.printf("%d %d %d\n", target, cnt, B[i]);

                B[i] -= (B[b1] + B[b2]) * cnt;
                ans += cnt;

//                System.out.printf("+ ");
//                for (int j=0;j<N;j++) {
//                    System.out.printf("%d ", B[j]);
//                }
//                System.out.println();
                if (B[i] < A[i]) {
                    ans = -1;
                    break;
                } else if (B[i] > A[i]) {
                    pq.add(new Num(i, B[i]));
                }
            }
        }

        for (int i=0;i<N;i++) {
            if (A[i] != B[i]) {
                ans = -1;
            }
        }

        out.println(ans);
        out.flush();
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }

        int[] nextIntArray(int N) {
            int a[] = new int[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextInt();
            }

            return a;
        }

        long[] nextLongArray(int N) {
            long a[] = new long[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextLong();
            }

            return a;
        }

        double[] nextDoubleArray(int N) {
            double a[] = new double[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextDouble();
            }

            return a;
        }

        String[] nextTokenArray(int N) {
            String a[] = new String[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextToken();
            }

            return a;
        }
    }
}