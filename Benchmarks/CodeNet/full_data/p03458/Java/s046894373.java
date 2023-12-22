import java.util.Scanner;

public class Main {
	static int [][]_2Cum_sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int k2 = k*2;
		long[][] Hope = new long [n][3];
		int[][] map = new int [k2][k2];
		//二次元累積和
		_2Cum_sum = new int[k2+1][k2+1];

		//W=-1,B=1としてHope[i][2]にいれる
		for(int i=0;i<n;i++) {
			Hope[i][0] = Long.parseLong(sc.next());
			Hope[i][1] = Long.parseLong(sc.next());
			Hope[i][2] = sc.next().equals("W")?-1:1;
		}
		sc.close();

		for(int i=0;i<n;i++) {
			//y: -1("W")ならば+kして黒と同じ扱いに
			long x = Hope[i][0];
			long y = Hope[i][2]==-1?Hope[i][1]+k:Hope[i][1];
			//(0,0)=(0+k*2,0+k*2)のため(x%(k*2),y%(k*2))
			map[(int)y%k2][(int)x%k2]++;
		}

		//二次元累積和
		for (int i = 1; i <= k*2; i++) {
		    for (int j = 1; j <= k*2; j++) {
		        _2Cum_sum[i][j] = _2Cum_sum[i-1][j] + _2Cum_sum[i][j-1]  + map[i - 1][j - 1] -_2Cum_sum[i - 1][j - 1];
		    }
		}

        int max = 0;
        for (int i = 0; i < k2; i++) {
            for (int j = 0; j < k2; j++) {
                int y0 = k2, x0 = k2;
                int y1 = Math.min(i + k, k2), x1 = Math.min(j + k, k2);
                int y2 = i, x2 = j;
                int y3 = Math.max(i - k, 0), x3 = Math.max(j - k, 0);
                int y4 = 0, x4 = 0;

                int sum = _2Cum_sum_sum(y1, y0, x1, x0)+ _2Cum_sum_sum(y1, y0, x3, x2)+ _2Cum_sum_sum(y2, y1, x2, x1)
                          + _2Cum_sum_sum(y2, y1, x4, x3)+ _2Cum_sum_sum(y3, y2, x3, x2)+ _2Cum_sum_sum(y3, y2, x1, x0)
                          + _2Cum_sum_sum(y4, y3, x4, x3)+ _2Cum_sum_sum(y4, y3, x2, x1);

                max = Math.max(sum, max);
            }
        }
        System.out.println(max);

	}
    private static int _2Cum_sum_sum(int ya, int yb, int xa, int xb) {
        return _2Cum_sum[ya][xa] + _2Cum_sum[yb][xb] - _2Cum_sum[yb][xa] - _2Cum_sum[ya][xb];
    }

}