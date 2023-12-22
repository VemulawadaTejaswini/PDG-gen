import java.util.Scanner;

public class Main {
    private static int N,K;
    private static int[][] mem;
    private static int[][] cum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        mem = new int[2*K][2*K];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt()%(2*K);
            int y = sc.nextInt()%(2*K);
            String c = sc.next();
            if(c.equals("B")) {
                x = (x+K)%(2*K);
            }
            mem[y][x]++;
        }

        cum = new int[2*K+1][2*K+1];
        for(int y = 0; y < 2*K; y++) {
            for(int x = 0; x < 2*K; x++) {
                cum[y+1][x+1] = cum[y][x+1] + cum[y+1][x] - cum[y][x] + mem[y][x];
            }
        }

        int ans = 0;
        for(int y = 0; y < K; y++) {
            for(int x = 0; x < K; x++) {
                int tmp = cum[y+K+1][x+K+1] - cum[y][x+K+1] - cum[y+K+1][x] + cum[y][x];
                ans = Math.max(ans, tmp);
            }
        }
        System.out.println(ans);
    }
}