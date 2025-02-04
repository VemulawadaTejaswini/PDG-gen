
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int k = sc.nextInt();

        PriorityQueue<Integer> negQ = new PriorityQueue<>((e1,e2)-> e2-e1);
        PriorityQueue<Integer> pogQ = new PriorityQueue<>();

        for (int i=0;i<n;i++){
            int tmp=sc.nextInt();
            if (tmp<0){
                negQ.add(tmp);
            } else {
                pogQ.add(tmp);
            }
        }

        int now = 0;

        int ans = 0;
        for (int i = k; 0 < i; i--) {
            int pog = Math.abs(pogQ.peek()-now);
            int neg = Math.abs(negQ.peek()-now);

            if (pog < neg) {
                ans += Math.abs(pogQ.poll()-now);
            } else {
                ans += Math.abs(negQ.poll()-now);
            }

        }
        out.println(ans);
        out.flush();
    }

    //    public static void calcD(Map<Integer, Integer> dic, int index, )

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
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
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
    }
}