import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int W = in.nextInt();
      
      long[] cur = new long[W + 1];
      long[] pre = new long[W + 1];
        for (int i = 0; i < N; i++) {
          int w = in.nextInt();
          long v  = in.nextLong();
          for (int j = w; j <= W; j++) {
            cur[j] = Math.max(pre[j], pre[j-w] + v);
          }
          pre = cur;
          cur = new long[W + 1];
        }
        in.close();
        System.out.println(pre[W]);
    }
}