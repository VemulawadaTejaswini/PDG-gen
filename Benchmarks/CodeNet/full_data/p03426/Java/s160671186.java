import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Pair {
    private int first;
    private int second;

    public Pair(int a, int b) {
        first = a;
        second = b;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        Pair[] lookup = new Pair[w * h + 1];
        int value;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                value = sc.nextInt();
                lookup[value] = new Pair(i + 1, j + 1);
            }
        }
        int numQueries = sc.nextInt();
        int start, end, previous;
        int previousFirst, previousSecond, currFirst, currSecond;
        long cost;
        for (int i = 0; i < numQueries; i++) {
            cost = 0;
            start = sc.nextInt();
            end = sc.nextInt();
            previous = start;
            for (int j = start + d; j <= end; j += d) {
                previousFirst = lookup[previous].getFirst();
                previousSecond = lookup[previous].getSecond();
                currFirst = lookup[j].getFirst();
                currSecond = lookup[j].getSecond();
                cost += Math.abs(previousFirst - currFirst);
                cost += Math.abs(previousSecond - currSecond);
                previous = j;
            }
            System.out.println(cost);
        }
    }
}