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

    static class Pair{
        public int x;
        public int y;
        public Pair(int x,int y) {
            this.x=x;
            this.y=y;
        }
        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Pair) {
                Pair other = (Pair) obj;
                return other.x==this.x && other.y==this.y;
            }
            return false;
        }
        @Override
        public int hashCode() {
            return Objects.hash(this.x,this.y);
        }
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int N = in.nextInt();
        int D = in.nextInt();

        HashMap<Pair, Integer> map = new HashMap<Pair, Integer>();
        for (int i=0;i<N;i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            Pair pair = new Pair(x%D, y%D);
            if (map.containsKey(pair)) {
                map.put(pair, map.get(pair)+1);
            } else {
                map.put(pair, 1);
            }
        }
        // out.println(map.values());

        ArrayList<Integer> val = new ArrayList<Integer>(map.values());
        int max = 0;
        for (int i=0;i<val.size();i++) {
            max = Math.max(max, val.get(i));
        }

        ArrayList<Pair> key = new ArrayList<Pair>(map.keySet());
        ArrayList<Integer> p_x = new ArrayList<Integer>();ArrayList<Integer> m_x = new ArrayList<Integer>();ArrayList<Integer> p_y = new ArrayList<Integer>();ArrayList<Integer> m_y = new ArrayList<Integer>();
        for (int i=0;i<key.size();i++) {
            if (max==map.get(key.get(i))) {
                int x = key.get(i).x;
                int y = key.get(i).y;
                // out.println("x, y: "+x+" "+y);
                p_x.add(x);m_x.add((D-x)%D);p_y.add(y);m_y.add((D-y)%D);
            }
        }
        Collections.sort(p_x);Collections.sort(m_x);Collections.sort(p_y);Collections.sort(m_y);
        int xx = 0;
        int yy = 0;
        if (p_x.size()!=1) {
            xx = Math.min(p_x.get(1)-p_x.get(0), m_x.get(1)-m_x.get(0));
        }
        if (p_y.size()!=1) {
            yy = Math.min(p_y.get(1)-p_y.get(0), m_y.get(1)-m_y.get(0));
        }
        int mm = Math.max(xx, yy);
        // out.println(m_x);
        out.println(D*(int)(Math.ceil(Math.sqrt(max))-1)+mm);

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
