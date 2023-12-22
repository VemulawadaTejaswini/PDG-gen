
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    private static FastReader fr = new FastReader();
    private static PrintWriter out=new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // code goes here
        int n = fr.nextInt();
        int[] arr = fr.nextIntArray(n);

        long ans = 0;
        List<Long> m = new ArrayList<>();
        for(int i = 0; i < n; i++) m.add((long) arr[i]);

        while (m.size() >= 2){
            List<Pair<Integer, Long>> list = new LinkedList<>();
            for(int j = 0; j < m.size() - 1; j++){
                list.add(new Pair<>(j, m.get(j) + (long) m.get(j + 1)));
            }
            list.sort(new Comparator<Pair<Integer, Long>>() {
                @Override
                public int compare(Pair<Integer, Long> o1, Pair<Integer, Long> o2) {
                    return (int) (o1.second - o2.second);
                }
            });
            Pair<Integer, Long> pair = list.get(0);
            ans += pair.second;
            m.add(pair.first, pair.second);
            int ind = pair.first;
            m.remove(ind + 1);
            m.remove(ind + 1);
        }
        sb.append(ans);
        System.out.print(sb.toString());
    }

    static class FastReader{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] nextLongArray(int n) {
            long[] a=new long[n];
            for (int i=0; i<n; i++) a[i]=nextLong();
            return a;
        }
    }

    static class Pair<A, B>{
        A first;
        B second;
        public Pair(A first, B second){
            this.first = first;
            this.second = second;
        }
    }
}
