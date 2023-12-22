import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int[] a = intarr();
        int n = a[0];
        int c = a[1];

        NavigableMap<Integer, Queue<int[]>> m = new TreeMap<>();

        for(int i=0;i<n;i++) {
            int[] p = intarr();
            int s = p[0];
            int t = p[1];
            int chan = p[2];

            Queue<int[]> u = m.get(s);
            if(u == null) {
                u = new ArrayDeque<>();
                m.put(s,u);
            }
            u.add(new int[] { t, chan });
        }
        int recorders = 0;
        while(!m.isEmpty()) {
            recorders++;
            int from = -1;
            while(true) {
                Map.Entry<Integer, Queue<int[]>> floor = m.ceilingEntry(from);
                if(floor == null) {
                    break;
                }
                int[] dest = floor.getValue().poll();
                if(floor.getValue().isEmpty()) {
                    m.remove(floor.getKey());
                }
                from = dest[0] + 1;
            }
        }
        out(recorders);
    }

    private int[] intarr() throws IOException {
        return intarr(rd.readLine());
    }

    private int[] intarr(String s) {
        String[] q = split(s);
        int n = q.length;
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(q[i]);
        }
        return a;
    }

    private String[] split(String s) {
        if(s == null) {
            return new String[0];
        }
        int n = s.length();
        int start = -1;
        int end = 0;
        int sp = 0;
        boolean lastWhitespace = true;
        for(int i=0;i<n;i++) {
            char c = s.charAt(i);
            if(isWhitespace(c)) {
                lastWhitespace = true;
            } else {
                if(lastWhitespace) {
                    sp++;
                }
                if(start == -1) {
                    start = i;
                }
                end = i;
                lastWhitespace = false;
            }
        }
        if(start == -1) {
            return new String[0];
        }
        String[] res = new String[sp];
        int last = start;
        int x = 0;
        lastWhitespace = true;
        for(int i=start;i<=end;i++) {
            char c = s.charAt(i);
            boolean w = isWhitespace(c);
            if(w && !lastWhitespace) {
                res[x++] = s.substring(last,i);
            } else if(!w && lastWhitespace) {
                last = i;
            }
            lastWhitespace = w;
        }
        res[x] = s.substring(last,end+1);
        return res;
    }

    private boolean isWhitespace(char c) {
        return c==' ' || c=='\t';
    }

    private static void out(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
