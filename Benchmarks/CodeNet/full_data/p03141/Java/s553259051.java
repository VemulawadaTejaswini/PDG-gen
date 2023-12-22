import java.util.*;

public class Main {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Q qui[] = new Q[N];
        boolean taken[] = new boolean[N];
        List<PriorityQueue<Q>> que = new ArrayList<PriorityQueue<Q>>();
        que.add(new PriorityQueue<>(C::compareQForA));
        que.add(new PriorityQueue<>((q1, q2) -> -compareQForA(q1, q2)));

        for (int i = 0; i < N; i++) {
            qui[i] = new Q(sc.nextInt(), sc.nextInt(), i);
            que.get(0).add(qui[i]);
            que.get(1).add(qui[i]);
        }

        long val[] = new long[2];
        for (int i = 0; i < N; i++) {
            proceed(que.get(0), taken);
            proceed(que.get(1), taken);
            final int me = i%2;
            final int you = (i+1)%2;
            boolean last = i == N - 1;
            if (last) {
                que.get(0).poll();
                Q q = que.get(1).poll();
                val[me] += q.V[me];
                break;
            }

            Q qme = que.get(me).poll();
            Q qyou = que.get(you).poll();
            Q qyoutmp = null;
            if (qme.idx == qyou.idx) {
                qyoutmp = qyou;
                qyou = que.get(you).poll();
            }
            long vForMyMax = qme.V[me] - qyou.V[you];
            que.get(me).add(qme);
            que.get(you).add(qyou);
            if (qyoutmp != null) {
                que.get(you).add(qyoutmp);
            }
            qme = null;
            qyou = null;
            qyoutmp = null;

            qme = que.get(you).poll();
            qyou = que.get(you).poll();
            long vForYouMin = qme.V[me] - qyou.V[you];
            que.get(you).add(qme);
            que.get(you).add(qyou);

            qme = null;
            qyou = null;
            qyoutmp = null;

            if (vForMyMax > vForYouMin) {
                qme = que.get(me).poll();
            } else {
                qme = que.get(you).poll();
            }
            val[me] += qme.V[me];
            taken[qme.idx] = true;
        }
        System.out.println(val[0] - val[1]);
    }
}
