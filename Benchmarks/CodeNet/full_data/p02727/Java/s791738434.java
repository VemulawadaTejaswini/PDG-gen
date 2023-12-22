import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        Integer[] p = new Integer[A];
        Integer[] q = new Integer[B];
        Integer[] r = new Integer[C];
        for (int i=0;i<A;i++) p[i] = sc.nextInt();
        for (int i=0;i<B;i++) q[i] = sc.nextInt();
        for (int i=0;i<C;i++) r[i] = sc.nextInt();

        Arrays.sort(p, (o1, o2)->Integer.compare(o2, o1));
        Arrays.sort(q, (o1, o2)->Integer.compare(o2, o1));
        Arrays.sort(r);

        PriorityQueue<Integer> r_ = new PriorityQueue<Integer>((o1, o2)->Integer.compare(o2, o1));
        for (int i=0;i<C;i++) {
            r_.add(r[i]);
        }

        long ans = 0L;
        PriorityQueue<int[]> p_q = new PriorityQueue<int[]>((o1, o2)->Integer.compare(o1[0], o2[0]));
        for (int i=0;i<X;i++) {
            int[] add = {p[i], 0};
            ans += p[i];
            p_q.add(add);
        }
        for (int i=0;i<Y;i++) {
            int[] add = {q[i], 1};
            ans += q[i];
            p_q.add(add);
        }

        // System.out.println(ans);
        // System.out.println(Arrays.toString(r));
        for (int i=C-1;i>=0;i--) {
            int[] rem = p_q.peek();
            // System.out.println(i);
            // System.out.println(Arrays.toString(rem));
            if (rem[0]>=r[i]) {
                break;
            } else {
                ans-=rem[0];
                ans+=r[i];
                p_q.poll();
            }
        }
        System.out.println(ans);
    }
}