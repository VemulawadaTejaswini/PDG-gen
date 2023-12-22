import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int ans = count();
        System.out.println(ans);
    }

    static int count() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = sc.nextInt();
        int[][] ret = new int[n][idx];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < idx; j++) {
                ret[i][j] = sc.nextInt();
            }
            ans += cntInt(i, idx, ret);
        }
        sc.close();

        return ans;
    }
    static int cntInt(int i, int idx, int[][] ret) {
    	int cnt = 0;

        if (i > 0) {
            for (int k = 0; k < i; k++) {
                double sum = 0;
            	for (int j = 0; j < idx; j++) {
            		sum += Math.pow(Math.abs(ret[i][j] - ret[k][j]), 2);
            	}
                double calc = Math.sqrt(sum);
                if (calc == Math.floor(calc)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}