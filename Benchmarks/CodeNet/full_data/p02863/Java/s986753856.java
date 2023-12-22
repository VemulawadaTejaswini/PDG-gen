import java.util.*;


public  class Main {

    static class Node implements Comparable<Node>{

        @Override
        public int compareTo(Node o) {
            return ((Integer) o.A).compareTo(A);
        }

        int A;

        int B;

        public Node(int A, int B) {

            this.A = A;
            this.B= B;
        }
    }

    static int N;

    static int T;

    static Node[] nodes;

    static int[][] dp;

    public static void main(String[] args) {

        Scanner s=  new Scanner(System.in);

        int N = s.nextInt();

        int T = s.nextInt();

        nodes = new Node[N];

        dp = new int[N][T+1];

        for (int i = 0; i < N; i++) {

            int a = s.nextInt();

            int b = s.nextInt();

            nodes[i] = new Node(a,b);
        }

        Arrays.sort(nodes);

        System.out.println(happy(N-1 , T));
    }

    static int happy(int n, int t) {

        if (t == 0 || n < 0) return 0;

        if (dp[n][t] != 0) return dp[n][t];

        int a = nodes[n].A;

        int b = nodes[n].B;

        int r1 = happy(n-1, Math.max(0, t- a)) + b;

        int r2 = happy(n-1, t);

        int m = Math.max(r1,r2);

        dp[n][t] = m;

        return m;
    }
}