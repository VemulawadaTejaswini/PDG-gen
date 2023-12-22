import java.util.*;
public class Main {
    static final long MOD = (1000000000L+7L);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Infant> li = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            int active  = sc.nextInt();
            li.add(new Infant(i, active));
        }
        Collections.sort(li);
//        for(Infant i : li) {
//            System.out.println(String.format("(%d,%d)", i.pos, i.act));
//        }
        int dp[][] = new int[N+1][N+1];

        for(int sum=1; sum<=N; sum++) {
            for(int x=0; x<=sum; x++) {
                int y=sum-x;
                Infant target = li.get(sum-1);
                int left_score = (x>0) ? dp[x-1][y] + Math.abs(target.pos-x)*target.act : 0;
                int right_score = (y>0) ? dp[x][y-1] + Math.abs(target.pos-(N-y+1))*target.act : 0;
                dp[x][y] = Math.max(left_score, right_score);
            }
        }
        int score = 0;
        for(int sum=1; sum<=N; sum++) {
            for(int x=0; x<=sum; x++) {
                int y=sum-x;
                if(dp[x][y]>score) score=dp[x][y];
            }
        }
        System.out.println(score);
    }

    static class Infant implements Comparable<Infant> {
        int pos;
        int act;
        Infant(int p, int a) {
            this.pos = p;
            this.act = a;
        }

        @Override
        public int compareTo(Infant o) {
            return -1*(this.act - o.act);
        }
    }
}
