public class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int d[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                d[i][j] = sc.nextInt();
            }
        }
        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 10; i++ ) {
                for (int j = 0; j < 10; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
        
        int ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int tmp = sc.nextInt();
                if (tmp != -1) ans += d[tmp][1];
            }
        }
        System.out.println(ans);
    }
}