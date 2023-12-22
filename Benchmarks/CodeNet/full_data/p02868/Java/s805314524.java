import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Scanner sc = new Scanner(System.in);
        int V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        ArrayList<ArrayList<int[]>> edge = new ArrayList<ArrayList<int[]>>();
        for (int i=0;i<V;i++) {
            ArrayList<int[]> add = new ArrayList<int[]>();
            edge.add(add);
        }
        for (int i=0;i<E;i++) {
            int s = Integer.parseInt(sc.next())-1;
            int t = Integer.parseInt(sc.next())-1;
            int d = Integer.parseInt(sc.next());
            int[] add = {t, d};
            edge.get(s).add(add);
        }
        for (int i=1;i<V;i++) {
            int[] add = {i-1, 0};
            edge.get(i).add(add);
        }
        Comparator<long[]> comparator = new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                return Long.compare(o1[1], o2[1]);
            }
        };
        long[] ans = new long[V];
        for (int i=0;i<V;i++) {
            ans[i] = -1;
        }
        PriorityQueue<long[]> queue = new PriorityQueue<long[]>(comparator);
        int[] flag = new int[V];
        long[] first = {0, 0};
        queue.add(first);
        while(!queue.isEmpty()) {
            long[] rem = queue.remove();
            if (flag[(int)rem[0]]==1) {
                continue;
            }
            flag[(int)rem[0]]=1;
            ans[(int)rem[0]] = rem[1];
            // System.out.println("rem: " + Arrays.toString(rem));
            for (int[] tmp : edge.get((int)rem[0])) {
                long[] add = {tmp[0], tmp[1]+rem[1]};
                queue.add(add);
            }
        }
            if (ans[V-1]==-1) {
                System.out.println(-1);
            } else {
                System.out.println(ans[V-1]);
            }
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
