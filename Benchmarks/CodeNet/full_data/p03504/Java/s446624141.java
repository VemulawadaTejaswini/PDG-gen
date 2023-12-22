import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
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

        NavigableMap<Integer, Map<Integer, Queue<Integer>>> m = new TreeMap<>();

        for(int i=0;i<n;i++) {
            int[] p = intarr();
            int s = p[0];
            int t = p[1];
            int chan = p[2];

            Map<Integer, Queue<Integer>> u = m.get(s);
            if(u == null) {
                u = new HashMap<>();
                m.put(s,u);
            }
            Queue<Integer> q = u.get(chan);
            if(q == null) {
                q = new ArrayDeque<>();
                u.put(chan, q);
            }
            q.add(t);
        }
        int recorders = 0;
        while(!m.isEmpty()) {
            recorders++;
            int from = -1;
            int prevChannel = -1;
            while(true) {
                Map.Entry<Integer, Map<Integer, Queue<Integer>>> floor = m.ceilingEntry(from);
                if(floor == null) {
                    break;
                }
                boolean process = true;
                if(prevChannel != -1) {
                    Queue<Integer> programs = floor.getValue().get(prevChannel);
                    if(programs == null) {
                        floor = m.ceilingEntry(from+1);
                        if(floor == null) {
                            break;
                        }
                    } else {
                        process = false;
                        from = programs.poll();
                        if(programs.isEmpty()) {
                            floor.getValue().remove(prevChannel);
                            if(floor.getValue().isEmpty()) {
                                m.remove(floor.getKey());
                            }
                        }
                    }
                }
                if(process) {
                    Map.Entry<Integer, Queue<Integer>> qq = floor.getValue().entrySet().iterator().next();
                    from = qq.getValue().poll();
                    if (qq.getValue().isEmpty()) {
                        floor.getValue().remove(qq.getKey());
                        if(floor.getValue().isEmpty()) {
                            m.remove(floor.getKey());
                        }
                    }
                    prevChannel = qq.getKey();
                }
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
