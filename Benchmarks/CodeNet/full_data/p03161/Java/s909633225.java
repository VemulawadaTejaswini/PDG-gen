import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
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

        int nextInt() {
            return (Integer.parseInt(next()));
        }

        long nextLong() {
            return (Long.parseLong(next()));
        }

        String nextLine() {
            String s = "";
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
        }
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n=in.nextInt();
        int k=in.nextInt();
        int h[]=new int[n];
        for(int i=0;i<n;i++){
            h[i]=in.nextInt();
        }
        int a[]=new int[n];
        if(n>k) {
            a[0] = 0;
            for (int i = 1; i <= k; i++) {
                a[i] = Math.abs(h[i] - h[0]);
            }

            for (int i = k; i < n; i++) {
                int y = i - 1;
                int c = 0;
                int min = Integer.MAX_VALUE;
                while (c < k ) {
                    if (min > a[y] + Math.abs(h[y] - h[i])) {
                        min = a[y] + Math.abs(h[y] - h[i]);

                    }
                    y--;
                    c++;
                }
               // System.out.println(min);
                a[i] = min;
            }

            System.out.println(a[n - 1]);
        }
        else{
            System.out.println(h[n-1]-h[0]);
        }

    }
}
