import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int ans = 0;
        int[][] ary = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                ary[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i = 0; i < n; i++) {
            ans += permutation(ary, n, i, i+1, d, 0);
        }
        System.out.println(ans);

    }

    private static int permutation(int[][] ary, int N, int n, int o, int d, int cnt){
        if(N == o){
          return cnt;
        }
        int sum = 0;
        for (int i = 0; i < d; i++) {
            int a = ary[n][i];
            int b = ary[o][i];
            sum += Math.abs(Math.pow((a-b),2));
        }
        int sqrt = (int) Math.sqrt(sum);
        if (sqrt * sqrt == sum) {
            cnt++;
        }
        o++;
        return permutation(ary, N, n, o, d, cnt);
      }
}