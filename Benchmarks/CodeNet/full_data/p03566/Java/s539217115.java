import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Main {
    private static final double EPS = 1e-9;
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int n = pint();
        int[] t = intarr();
        int[] p = intarr();

        double all = 0;
        for(int ts: t) {
            all += ts;
        }

        Node root = new Node();
        root.add(new Con(0, all/2, 0, 1));
        root.add(new Con(all/2, all, all/2, -1));
        double sum = 0;
        for(int i=0;i<n;i++) {
            Node node = new Node();
            node.addCon(0, sum, p[i] + sum, -1);
            node.addCon(sum, sum + t[i], p[i], 0);
            node.addCon(sum + t[i], all, p[i], 1);

            sum += t[i];

            root = merge(root, node);
        }

        double dist = 0;
        for(Con con: root.cons) {
            if(con.type == 0) {
                dist += con.v * con.time();
            } else {
                double b = min(con.v, con.last());
                double e = max(con.v, con.last());
                dist += acc(e) - acc(b);
            }
        }
        out(dist);
    }

    private double acc(double t) {
        return t * t / 2;
    }

    private class Node {
        List<Con> cons = new ArrayList<>();

        public void add(Con con) {
            cons.add(con);
        }


        public void addCon(double start, double end, double v, int type) {
            if(start + EPS < end) {
                cons.add(new Con(start, end, v, type));
            }
        }
    }

    private Node merge(Node a, Node b) {
        Node res = new Node();
        int i = 0;
        int j = 0;
        while(i < a.cons.size() && j < b.cons.size()) {
            Con ac = a.cons.get(i);
            Con bc = b.cons.get(j);
            double maxStart = max(ac.start, bc.start);
            double minEnd = min(ac.end, bc.end);
            if(maxStart < minEnd) {
                Con d = ac.slice(maxStart, minEnd);
                Con e = bc.slice(maxStart, minEnd);
                double p = d.crossPoint(e);
                if(p < 0) {
                    res.add(minCon(d,e));
                } else {
                    Con d1 = d.slice(maxStart, p);
                    Con d2 = d.slice(p, minEnd);
                    Con e1 = e.slice(maxStart, p);
                    Con e2 = e.slice(p, minEnd);

                    res.add(minCon(d1,e1));
                    res.add(minCon(d2,e2));
                }
                if(ac.end == bc.end) {
                    i++;
                    j++;
                } else if(ac.end == minEnd) {
                    i++;
                } else {
                    j++;
                }
            } else if(maxStart >= ac.end) {
                i++;
            } else {
                j++;
            }
        }
        if(i < a.cons.size()) {
            res.cons.addAll(a.cons.subList(i, a.cons.size()));
        }
        if(j < b.cons.size()) {
            res.cons.addAll(b.cons.subList(j, b.cons.size()));
        }
        return res;
    }

    private Con minCon(Con d, Con e) {
        boolean d1 = d.v <= e.v;
        boolean d2 = d.last() <= e.last();
        return d1 && d2 ? d : e;
    }

    private class Con {
        double start;
        double end;
        double v;
        int type;

        public Con(double start, double end, double v, int type) {
            this.start = start;
            this.end = end;
            this.v = v;
            this.type = type;
        }

        public Con slice(double maxStart, double minEnd) {
            if(type == 0) {
                return new Con(maxStart, minEnd, v, 0);
            } else if(type == 1) {
                return new Con(maxStart, minEnd, v + (maxStart - start), 1);
            }
            return new Con(maxStart, minEnd, v - (maxStart - start), -1);
        }

        public double crossPoint(Con other) {
            switch(type) {
                case 0:
                    switch(other.type) {
                        case 0:
                            return -1;
                        case -1:
                            if(v < other.v && last() > other.last()) {
                                return start + (other.v - v);
                            }
                            return -1;
                        case 1:
                            if(v > other.v && last() < other.last()) {
                                return start + (other.v - v);
                            }
                            return -1;
                    }
                case 1:
                    switch(other.type) {
                        case -1:
                            if(v < other.v && last() > other.last()) {
                                return (other.v - v) / 2 + start;
                            } else {
                                return -1;
                            }
                        case 0:
                            if(v < other.v && last() > other.last()) {
                                return other.v - v + start;
                            } else {
                                return -1;
                            }
                        case 1:
                            return -1;
                    }
                default:
                    if(other.type == -1) {
                        return -1;
                    }
                    return other.crossPoint(this);
            }
        }

        private double last() {
            if(type == 0) {
                return v;
            } else if(type == 1) {
                return v + (end - start);
            } else {
                return v - (end - start);
            }
        }

        public double time() {
            return end - start;
        }
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
