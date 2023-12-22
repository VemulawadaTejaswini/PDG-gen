import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int u = Integer.parseInt(sc.next())-1;
        int v = Integer.parseInt(sc.next())-1;
        ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            edge.add(add);
        }
        for (int i=0;i<N-1;i++) {
            int A = Integer.parseInt(sc.next())-1;
            int B = Integer.parseInt(sc.next())-1;
            edge.get(A).add(B);
            edge.get(B).add(A);
        }
        int[] takahashi = new int[N];
        int[] aoki = new int[N];
        Arrays.fill(takahashi, -1);
        Arrays.fill(aoki, -1);

        ArrayDeque<int[]> q = new ArrayDeque<int[]>();
        // takahashi
        int[] f_1 = {u, 0};
        q.add(f_1);
        while (!q.isEmpty()) {
            int[] rem = q.poll();
            if (takahashi[rem[0]]!=-1) continue;
            takahashi[rem[0]]=rem[1];
            for (Integer i : edge.get(rem[0])) {
                int[] add = {i, rem[1]+1};
                q.add(add);
            }
        }

        // aoki
        int[] f_2 = {v, 0};
        q.add(f_2);
        while (!q.isEmpty()) {
            int[] rem = q.poll();
            if (aoki[rem[0]]!=-1) continue;
            aoki[rem[0]]=rem[1];
            for (Integer i : edge.get(rem[0])) {
                int[] add = {i, rem[1]+1};
                q.add(add);
            }
        }

        int ans = 0;
        for (int i=0;i<N;i++) {
            if (takahashi[i]<aoki[i]) {
                ans = Math.max(ans, aoki[i]-1);
            }
        }
        System.out.println(ans);
    }
}