import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Math.max;
import static java.util.Collections.*;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int[] nm = intarr();
        int n = nm[0];
        int m = nm[1];
        List<Set<Integer>> edges = new ArrayList<>();
        for(int i=0;i<n;i++) {
            edges.add(new HashSet<>());
        }
        for(int i=0;i<m;i++) {
            int[] a = intarr();
            a[0]--;
            a[1]--;
            edges.get(a[0]).add(a[1]);
            edges.get(a[1]).add(a[0]);
        }

        int maxCross = -1;
        if(n <= 10) {
            int[] ix = new int[n];
            int s = 1<<n;
            for(int k=0;k<s;k++) {
                int left = k*2;
                int right = left+1;
                for(int j=0;j<n;j++) {
                    ix[j] = (k&(1<<j))>0?left:right;
                }
                boolean ok = true;
                outer: for(int z=left;z<=right;z++) {
                    for (int a = 0; a < n; a++) {
                        if(ix[a] == z) {
                            for (int b = 0; b < n; b++) {
                                if(a != b && ix[b] == z) {
                                    if(!edges.get(a).contains(b)) {
                                        ok = false;
                                        break outer;
                                    }
                                }
                            }
                        }
                    }
                }
                if(ok) {
                    int cross = 0;
                    for(int a=0;a<n;a++) {
                        for(int b=0;b<n;b++) {
                            if(a < b && ix[a] != ix[b] && edges.get(a).contains(b)) {
                                cross++;
                            }
                        }
                    }
                    maxCross = max(maxCross, cross);
                }
            }
        } else {
            Set<Integer> w2 = new HashSet<>();
            w2.add(0);
            w2.add(1);
            w2.add(n/2);
            w2.add(n-1);
            w2.add(n);
            for(Integer w: w2) {
                Set<Integer> clique0 = attain(w, n, edges, emptySet());
                if (clique0.size() == n) {
                    maxCross = 0;
                    break;
                } else {
                    int nextFree = -1;
                    for (int i = 0; i < n; i++) {
                        if (!clique0.contains(i)) {
                            nextFree = i;
                            break;
                        }
                    }
                    Set<Integer> nextClique = attain(nextFree, n, edges, clique0);
                    if (clique0.size() + nextClique.size() == n) {
                        int cross = computeCross(clique0, n, edges);
                        maxCross = max(maxCross, cross);
                    }
                }
            }
        }
        out(maxCross == -1 ? -1 : (m - maxCross));
    }

    private int computeCross(Set<Integer> c1, int n, List<Set<Integer>> edges) {
        int cross = 0;
        for(int a=0;a<n;a++) {
            for(int b=0;b<n;b++) {
                if(a < b && c1.contains(a) != c1.contains(b) && edges.get(a).contains(b)) {
                    cross++;
                }
            }
        }
        return cross;
    }

    private Set<Integer> attain(int start, int n, List<Set<Integer>> edges, Set<Integer> other) {
        Set<Integer> res = new HashSet<>();
        res.add(start);
        for(int i=0;i<n;i++) {
            if(i != start && !other.contains(i)) {
                boolean ok = true;
                for(Integer v: res) {
                    if(!edges.get(i).contains(v)) {
                        ok = false;
                        break;
                    }
                }
                if(ok) {
                    res.add(i);
                }
            }
        }
        return res;
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
