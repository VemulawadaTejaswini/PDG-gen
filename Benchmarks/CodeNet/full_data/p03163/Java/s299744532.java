import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int W = in.nextInt();

        long[] cur = new long[W + 1];
        for (int i = 0; i < N; i++) {
            int w = in.nextInt();
            long v = in.nextLong();
            for (int j = W; j >= w; j--) {
                cur[j] = Math.max(cur[j], cur[j - w] + v);
            }
        }
        in.close();
        System.out.println(cur[W]);
    }
}