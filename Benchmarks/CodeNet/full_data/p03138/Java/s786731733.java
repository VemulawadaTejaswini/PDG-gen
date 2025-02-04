import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] x = new long[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextLong();
        }
        int[][] d = new int[n][40];
        int[] cnt0 = new int[40], cnt1 = new int[40];
        for(int i = 0; i < n; i++){
            d[i] = func(x[i]);
            for(int j = 0; j < 40; j++){
                if(d[i][j] == 0){
                    cnt0[j]++;
                }
                else if(d[i][j] == 1){
                    cnt1[j]++;
                }
            }
        }
        long ans = 0;
        int j = 0;
        long tmp = 0;
        while(j < 40){
            if(cnt0[j] > cnt1[j]){
                tmp = ans + (long) Math.pow(2, j);
            }
            if(tmp <= k) ans = tmp;
            else break;
            j++;
        }
        long aans = 0;
        for(int i = 0; i < n; i++){
            aans += x[i] ^ ans;
        }
        System.out.println(aans);
    }
    static int[] func(long x){
        int index = 0;
        long n = x;
        int[] res = new int[40];
        while(n > 0){
            res[index] = (int) (n % 2);
            index++;
            n /= 2;
        }
        return res;
    }
}