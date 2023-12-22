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
        Comparator<Integer[]> comparator_L = new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        };
        Comparator<Integer[]> comparator_R = new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return Integer.compare(o2[1], o1[1]);
            }
        };
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int N = in.nextInt();
        int[] flag = new int[N];
        int max_edge = 0;
        ArrayList<Integer[]> edge = new ArrayList<Integer[]>();
        for (int i=0;i<N;i++) {
            int L = in.nextInt();
            int R = in.nextInt();
            max_edge = Math.max(max_edge, R-L);
            Integer[] add = {L, R, i};
            edge.add(add);
        }
        ArrayList<Integer[]> edge_L = new ArrayList<Integer[]>(edge);
        ArrayList<Integer[]> edge_R = new ArrayList<Integer[]>(edge);
        Collections.sort(edge_L, comparator_L);
        Collections.sort(edge_R, comparator_R);

        int l_i=0;
        int r_i=0;
        int l_left = edge_L.get(0)[0];
        int l_right = edge_L.get(0)[1];
        int r_left = edge_R.get(0)[0];
        int r_right = edge_R.get(0)[1];
        for (int i=0;i<N;i++) {
            // if (l_i==N || r_i==N) {
            //     break;
            // }
            // System.out.println(Arrays.toString(edge_L.get(l_i)));
            // System.out.println(flag[edge_L.get(l_i)[2]]);
            while (flag[edge_L.get(l_i)[2]]!=0) {
                l_i++;
            }
            while (flag[edge_R.get(r_i)[2]]!=0) {
                r_i++;
            }
            // System.out.println("i: " + i + " l_dif: " + (edge_L.get(l_i)[0]-l_left) + " r_diff: " + (r_right-edge_R.get(r_i)[1]));
            if (edge_L.get(l_i)[0]-l_left <= r_right-edge_R.get(r_i)[1]) {
                l_left=edge_L.get(l_i)[0];
                // l_right=edge_L.get(l_i)[1];
                l_right=Math.min(l_right, edge_L.get(l_i)[1]);
                flag[edge_L.get(l_i)[2]]=1;
                // System.out.println("l_index: " + edge_L.get(l_i)[2]);
                l_i++;
            } else {
                // r_left = edge_R.get(r_i)[0];
                r_left = Math.max(r_left, edge_R.get(r_i)[0]);
                r_right = edge_R.get(r_i)[1];
                flag[edge_R.get(r_i)[2]]=1;
                // System.out.println("r_index: " + edge_R.get(r_i)[2]);
                r_i++;
            }
        }
        // System.out.println("l_left: " + l_left + " l_right: " + l_right);
        // System.out.println("r_left: " + r_left + " r_right: " + r_right);
        long ans = 0L;
        // if (l_right<r_left) {
            ans = l_right-l_left+1 + r_right-r_left+1;
        // } else {
            // ans = r_right-l_left+1;
        // }
        out.println(Math.max(ans, max_edge));
        // for (Integer[] i : edge_L) {
        //     out.println(Arrays.toString(i));
        // }


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
