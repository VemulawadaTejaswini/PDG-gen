import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {
    private static final long INF = Long.MAX_VALUE / 3;
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int n = pint();
        List<Map<Integer, Long>> edges = new ArrayList<>();
        for(int i=0;i<n;i++) {
            edges.add(new HashMap<>());
        }
        for(int i=0;i<n-1;i++) {
            int[] a = intarr();
            a[0]--;
            a[1]--;
            edges.get(a[0]).put(a[1], (long)a[2]);
            edges.get(a[1]).put(a[0], (long)a[2]);
        }

        int[] qk = intarr();
        int q = qk[0];
        int start = qk[1]-1;

        Queue<Integer> queue = new ArrayDeque<>();
        long[] dist = new long[n];
        for(int i=0;i<n;i++) {
            if(i != start) {
                dist[i] = INF;
            }
        }
        queue.add(start);
        while(!queue.isEmpty()) {
            int node = queue.poll();
            long curDist = dist[node];
            for(Map.Entry<Integer, Long> e: edges.get(node).entrySet()) {
                int next = e.getKey();
                long len = e.getValue();
                if(dist[next] > curDist + len) {
                    dist[next] = curDist + len;
                    queue.add(next);
                }
            }
        }

        StringBuilder buf = new StringBuilder();
        for(int i=0;i<q;i++) {
            int[] a = intarr();
            a[0]--;
            a[1]--;
            if(buf.length() > 0) {
                buf.append('\n');
            }
            buf.append(dist[a[0]] + dist[a[1]]);
        }
        out(buf);
    }

    private int pint() throws IOException {
        return pint(rd.readLine());
    }

    private int pint(String s) {
        return Integer.parseInt(s);
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
