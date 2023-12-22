import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mm = sc.nextInt();

        int[] u = new int[mm];
        int[] v = new int[mm];
        for(int i = 0; i < mm; i++) {
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int t = sc.nextInt();
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            l.add(new ArrayList<>());
        }
        for(int i = 0; i < mm; i++) {
            l.get(u[i] - 1).add(v[i] - 1);
        }

        boolean[][] visit = new boolean[n][4];
        ArrayDeque<Move> q = new ArrayDeque<>();
        q.add(new Move(s-1, 0, 0));
        int ans = -1;
        while(!q.isEmpty()) {
            Move m = q.poll();
            if(visit[m.now][m.num]) {
                continue;
            }
            visit[m.now][m.num] = true;
            if(m.num == 0) {
                if(m.now == t-1) {
                    ans = m.cc;
                    break;
                }
                m.num = 3;
                m.cc++;
            } 
            ArrayList<Integer> ll = l.get(m.now);

            for(int i = 0; i < ll.size(); i++) {
                q.add(new Move(ll.get(i), m.num - 1, m.cc));
            }
        }

        System.out.println(ans);



    }
    static class Move {
        int now;
        int num;
        int cc;
        Move(int a, int b, int c) {
            now = a;
            num = b;
            cc = c;
        }
    }
}