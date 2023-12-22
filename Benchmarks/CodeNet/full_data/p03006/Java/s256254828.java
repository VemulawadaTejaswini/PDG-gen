import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0;i < n;i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        if(n == 1){
            System.out.println(1);
            System.exit(0);
        }

        Set<Tuple> pqset = new HashSet<>();
        for(int i = 0;i < n;i++) {
            for (int j = i + 1; j < n; j++) {
                pqset.add(new Tuple(x[i] - x[j], y[i] - y[j]));
            }
        }

        int ans = Integer.MAX_VALUE;
        for(Tuple t : pqset){
            int cost = n;
            for(int i = 0;i < n;i++) {
                for (int j = 0; j < n; j++) {
                    if(i == j){
                        continue;
                    }
                    if(t.getX() + x[j] == x[i] && t.getY() + y[j] == y[i]){
                        cost--;
                    }
                }
            }
            ans = Math.min(ans, cost);
        }
        System.out.println(ans);
    }

    public static class Tuple{
        int x;
        int y;

        public Tuple(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public boolean equals(Object obj) {
            Tuple t = (Tuple)obj;
            return this.x == t.x && this.y == y;
        }
    }
}

