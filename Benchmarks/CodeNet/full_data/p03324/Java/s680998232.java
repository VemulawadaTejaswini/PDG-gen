public class Main {

    public static void main(String[] args) {
        //final FastScanner fs = new FastScanner("/Users/igorz/dev/google-prep/src/main/java/atcoder/abc100/input.txt");
        final FastScanner fs = new FastScanner();

        final int D = fs.nextInt();
        final int N = fs.nextInt();

        System.out.println((int)(N * Math.pow(100, D)));
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

        int[] nextIntArray() {
            final int N = nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = nextInt();
            }
            return arr;
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
    }
}