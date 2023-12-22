import java.io.*;
import java.util.*;

public class Main {
    static class Solver {
        int[] link,size;
        public void solve(MyReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            link = new int[n+1];
            size = new int[n+1];

            for (int i = 1; i <= n; i++) {
                link[i] = i;
                size[i] = 1;
            }
            
            Stack<Pair<Integer,Integer>> stack = new Stack<>();
            for (int i = 0; i < m; i++) {
                stack.push(new Pair<>(in.nextInt(),in.nextInt()));
            }

            long ans = (long)n*(n-1)/2;
            Stack<Long> res = new Stack<>();
            res.push(ans);

            while (stack.size() > 1){
                Pair<Integer,Integer> p = stack.pop();
                int u = p.x, v = p.y;

                u = find(u);
                v = find(v);

                if(u != v){
                    ans += (long)size[v]*(size[v]-  1)/2;
                    ans += (long)size[u]*(size[u]-  1)/2;

                    if (size[u] > size[v]){
                        size[u] += size[v];
                        link[v] = u;

                        ans -= (long)size[u]*(size[u]-  1)/2;

                    }
                    else{
                        size[v] += size[u];
                        link[u] = v;

                        ans -= (long)size[v]*(size[v]-  1)/2;

                    }
                }



                res.push(ans);

            }

            while (!res.isEmpty()){
                out.println(res.pop());
            }

            
        }

        int find(int x){
            if (x == link[x])return x;
            return link[x] = find(link[x]);
        }




    }

    public static void main(String[] args) {
        MyReader mr = new MyReader();
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        new Solver().solve(mr, out);
        out.close();
    }

    //////////////////////////////////////////////////////////////////////////
    //    static int[][] dir = {{0,1}, {1,0},{-1,0}, {0,-1}};
//    static int[][] dir = {{0,1}, {1,0},{-1,0}, {0,-1}, {-1,-1},{-1,1}, {1,1}, {1,-1}};
    static class MyReader {
        BufferedReader br;
        StringTokenizer st;

        MyReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            return st.nextToken();
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

        String nextLine() {
            String res = "";
            try {
                res = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return res;
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }

            return arr;
        }

        Integer[] nextIntegerArray(int n) {
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }

            return arr;
        }

        Long[] nextLongArray(int n) {
            Long[] arr = new Long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }

            return arr;
        }

        long[] nextlongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }

            return arr;
        }

        String[] nextStringArray(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = next();
            }
            return arr;
        }
    }

    /////////////////////////////////////////////////////////////    

    static class Pair<K, V> {
        K x;
        V y;

        public Pair(K x, V y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(x, pair.x) &&
                    Objects.equals(y, pair.y);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }


    /////////////////////////////////////////////////////////////

    static <T> void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}


