import java.util.*;

class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[][] ball = new int[N][2];
        for(int i=0;i<N;i++){
            ball[i][0] = sc.nextInt();
            ball[i][1] = sc.nextInt();
        }
        int result = N;
        int p = 0;
        int q = 0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                p = ball[j][0] - ball[i][0];
                q = ball[j][1] - ball[i][1];
                int cost = cost_calc(ball, p, q);
                if(cost < result)result=cost;
            }
        }
        System.out.println(result);
    }

    public static int cost_calc(final int[][] a, int p, int q) {
        int cost = 0;
        int N = a.length;
        int[][] ball = a;
        int[] check = new int[N];
        for(int i=0;i<N;i++){
            check[i] = 1;
        }
        for(int i=0;i<N;i++){
            int s = ball[i][0];
            int t = ball[i][1];
            for(int j=1+i;j<N;j++){
                int x = ball[j][0];
                int y = ball[j][1];
                if(Math.abs(x-p) == s && Math.abs(y-q) == t){
                    check[j] = 0;
                }
            }
        }
        for(int i=0;i<N;i++)cost+=check[i];
        return cost;
    }
}

