
import java.util.*;

public class C {
    static class Q {
        int V[];
        int idx;

        public Q(int a, int b, int idx) {
            V = new int[2];
            V[0] = a;
            V[1] = b;
            this.idx = idx;
        }
    }

    static int compareQForA(Q q1, Q q2) {
        if (q1.V[0] == q2.V[0]) {
            return q2.V[1] - q1.V[1];
        }
        return q2.V[0] - q1.V[0];
    }


    static void proceed(PriorityQueue<Q> q, boolean taken[]) {
        for (;q.isEmpty();) {
            if (taken[q.peek().idx]) {
                q.poll();
            }
        }
    }

    static void proceedBoth(PriorityQueue<Q> q[], boolean taken[]) {
        proceed(q[0], taken);
        proceed(q[1], taken);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Q qui[] = new Q[N];
        boolean taken[] = new boolean[N];
        PriorityQueue<Q>[] que = new PriorityQueue[2];

        que[0] = new PriorityQueue<>(C::compareQForA);
        que[1] = new PriorityQueue<>((q1, q2) -> -compareQForA(q1, q2));

        for (int i = 0; i < N; i++) {
            qui[i] = new Q(sc.nextInt(), sc.nextInt(), i);
            que[0].add(qui[i]);
            que[1].add(qui[i]);
        }

        long val[] = new long[2];
        for (int i = 0; i < N; i++) {
            proceed(que[0], taken);
            proceed(que[1], taken);
            final int me = i%2;
            final int you = (i+1)%2;
            boolean last = i == N - 1;
            if (last) {
                que[0].poll();
                Q q = que[1].poll();
                val[me] += q.V[me];
                break;
            }

            Q qme = que[me].poll();
            Q qyou = que[you].poll();
            Q qyoutmp = null;
            if (qme.idx == qyou.idx) {
                qyoutmp = qyou;
                qyou = que[you].poll();
            }
            long vForMyMax = qme.V[me] - qyou.V[you];
            que[me].add(qme);
            que[you].add(qyou);
            if (qyoutmp != null) {
                que[you].add(qyoutmp);
            }
            qme = null;
            qyou = null;
            qyoutmp = null;

            qme = que[you].poll();
            qyou = que[you].poll();
            long vForYouMin = qme.V[me] - qyou.V[you];
            que[you].add(qme);
            que[you].add(qyou);

            qme = null;
            qyou = null;
            qyoutmp = null;

            if (vForMyMax > vForYouMin) {
                qme = que[me].poll();
            } else {
                qme = que[you].poll();
            }
            val[me] += qme.V[me];
            taken[qme.idx] = true;
        }
        System.out.println(val[0] - val[1]);
    }
}
