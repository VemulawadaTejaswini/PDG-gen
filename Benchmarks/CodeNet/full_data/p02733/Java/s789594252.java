import java.util.*;
import java.io.BufferedInputStream;

public class Main {
    private static int res;
    private static int[][] num;
    private static int[][] sum;
    private static int K;
    public static void main(String[] args){
        Scanner sc = new Scanner (new BufferedInputStream(System.in));
        int m = sc.nextInt();
        int n = sc.nextInt();
        K = sc.nextInt();
        res = m + n;
        num = new int[m][n];
        sum = new int[m + 1][n + 1];
        for(int i = 1; i <= m; ++i) {
          String now = sc.next();
            for(int j = 1; j <= n; ++j) {
                num[i - 1][j - 1] = now.charAt(j - 1) - '0';
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + num[i - 1][j - 1];
            }
        }

        rowDfs(0, new boolean[m - 1], 0);
        System.out.println(res);
    }
    
    private static void rowDfs(int step, boolean[] rcut, int used) {
        if(step == rcut.length) {
            greedy(rcut, used, 0);
            return;
        }
        rcut[step] = true;
        rowDfs(step + 1, rcut, used + 1);
        rcut[step] = false;
        rowDfs(step + 1, rcut, used);        
    }
    private static void greedy(boolean[] rcut, int used, int start) {
        if(used >= res) return;
        List<Integer> index = new LinkedList<>();
        int i = 0;
        for(i = 0; i < rcut.length; ++i) {
            if(rcut[i]) index.add(i + 1);
        }
        index.add(num.length);
        boolean check = false;
        for(i = start + 1; i <= num[0].length; i++) {
            int j = 0;
            for(int ind : index) {
             // System.out.println(start + " " + i + " " + j + " " + ind + " " + used);
             // System.out.println(sum[ind][i] - sum[ind][start] - sum[j][i] + sum[j][start]);
                if(sum[ind][i] - sum[ind][start] - sum[j][i] + sum[j][start] > K) {
                    if(i != start + 1) greedy(rcut, used + 1, i - 1);
                    check = true;
                    break;
                }
                j = ind;
            }
            if(check) break;
        }
        if(!check) res = Math.min(used, res);
    }
}