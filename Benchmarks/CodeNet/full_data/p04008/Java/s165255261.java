import java.util.*;

class Main {
        private static int[] count, a;
        private static int N, K;
        private static Vector<Vector<Integer>> vec;
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                N = sc.nextInt();
                K = sc.nextInt();
                a = new int[N];
                count = new int[N];
                vec = new Vector<Vector<Integer>>();
                for (int i = 0; i < N; i++) {
                        vec.add(new Vector<Integer>());
                }
                for (int i = 0; i < N; i++) {
                        a[i] = sc.nextInt() - 1;
                        if (i != 0) {
                                (vec.get(a[i])).addElement(i);
                        }
                }
                int ans = 0;
                if (a[0] != 0) {
                        ans++;
                        a[0] = 0;
                }
                ans += dfs(0, 0);


                System.out.println(ans);
        }
        private static int dfs(int i, int now){
                int memo = 0;
                if (now == K + 1) {
                        memo++;
                        now = 1;
                }
                for (int j = 0; j < (vec.get(i)).size(); j++) {
                        memo += dfs((vec.get(i)).get(j), now+1);
                }
                return memo;
        }
}