import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.Collection;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC116_D solver = new ABC116_D();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC116_D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            long k = in.nextLong();


            Map<Long, Sushi> typeMap = new HashMap();
            PriorityQueue<Sushi> notDeliciousSushiQueue = new PriorityQueue<Sushi>(new MyComparator());
            PriorityQueue<Sushi> deliciousSushiQueue = new PriorityQueue<Sushi>(new MyComparator());


            //寿司を美味しさ順にQueueに挿入
            for (int i = 0; i < n; i++) {
                long t = in.nextLong();
                long d = in.nextLong();

                Sushi sushi = new Sushi(t, d);
                notDeliciousSushiQueue.add(sushi);

                if (typeMap.containsKey(t)) {
                    if (typeMap.get(t).d < sushi.d) {
                        typeMap.put(t, sushi);
                    }
                } else {
                    typeMap.put(t, sushi);
                }
            }

            for (long key : typeMap.keySet()) {
                Sushi sushi = typeMap.get(key);
                sushi.isNewType = true;
                deliciousSushiQueue.add(typeMap.get(key));
            }


            notDeliciousSushiQueue.removeIf(a -> a.isNewType);

            PriorityQueue<Sushi> ateDeliciousSushiQueue = new PriorityQueue<Sushi>(new MyComparator().reversed());
            PriorityQueue<Sushi> ateNotDeliciousSushiQueue = new PriorityQueue<Sushi>(new MyComparator().reversed());


            for (int i = 0; i < k - notDeliciousSushiQueue.size(); i++) {
                ateDeliciousSushiQueue.add(deliciousSushiQueue.poll());
            }

            for (int i = 0; i < k - ateDeliciousSushiQueue.size(); i++) {
                ateNotDeliciousSushiQueue.add(notDeliciousSushiQueue.poll());
            }


            ArrayList<Long> points = new ArrayList();
            points.add(calcPoint(ateDeliciousSushiQueue, ateNotDeliciousSushiQueue));
            int limit = deliciousSushiQueue.size();
            for (int i = 0; i < limit; i++) {
                long point = points.get(points.size() - 1);
                long types;
                Sushi removeSushi = ateNotDeliciousSushiQueue.poll();
                Sushi addSushi = deliciousSushiQueue.poll();

                ateDeliciousSushiQueue.add(addSushi);
                types = ateDeliciousSushiQueue.size();

                point -= removeSushi.d;
                point += addSushi.d;

                point += 2 * types - 1;
                points.add(point);

            }

            Collections.sort(points);
            Collections.reverse(points);
            out.print(points.get(0));


        }

        private long calcPoint(PriorityQueue<Sushi> ateDeliciousSushiQueue, PriorityQueue<Sushi> ateNotDeliciousSushiQueue) {
            long point = 0;
            long cntT = ateDeliciousSushiQueue.size();
            for (Sushi sushi : ateDeliciousSushiQueue) {
                point += sushi.d;
            }
            for (Sushi sushi : ateNotDeliciousSushiQueue) {
                point += sushi.d;
            }

            return point + cntT * cntT;
        }

    }

    static class MyComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            Sushi x = (Sushi) o1;
            Sushi y = (Sushi) o2;

            if (x.isNewType && !y.isNewType) {
                return -1;
            }

            if (!x.isNewType && y.isNewType) {
                return 1;
            }

            if (x.d < y.d) {
                return 1;
            } else if (x.d > y.d) {
                return -1;
            } else {
                return 0;
            }
        }

    }

    static class Sushi {
        long t;
        long d;
        boolean isNewType;

        Sushi(long t, long d) {
            this.t = t;
            this.d = d;
            this.isNewType = false;
        }

    }
}

