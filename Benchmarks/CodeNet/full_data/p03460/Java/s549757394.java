import java.util.Scanner;

public class Main {
    private static int N,K;
    private static int[][] cum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        cum = new int[2*K+1][2*K+1];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt()%(2*K);
            int y = sc.nextInt()%(2*K);
            String c = sc.next();
            if(c.equals("B")) {
                x = (x+K)%(2*K);
            }
            cum[y+1][x+1]++;
        }

        for(int y = 0; y < 2*K; y++) {
            for(int x = 0; x < 2*K; x++) {
                cum[y+1][x+1] += cum[y][x+1] + cum[y+1][x] - cum[y][x];
            }
        }

        int ans = 0;
        for(int y = 0; y <= K; y++) {
            for(int x = 0; x <= K; x++) {
                int tmp = count(0,0,x,y) + count(x+K,0,2*K,y) + count(x,y,x+K,y+K) + count(0,y+K,x,2*K) + count(x+K,y+K,2*K,2*K);
                ans = Math.max(ans, Math.max(tmp, N-tmp));
            }
        }
        System.out.println(ans);
    }

    private static int count(int x1, int y1, int x2, int y2) {
        return cum[y2][x2] - cum[y1][x2] - cum[y2][x1] + cum[y1][x1];
    }
}
