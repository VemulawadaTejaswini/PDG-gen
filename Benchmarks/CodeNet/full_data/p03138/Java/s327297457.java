import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextInt();
        long[] x = new long[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextLong();
        }
        long[][] d = new long[n][50];
        int[] cnt0 = new int[50], cnt1 = new int[50];
        for(int i = 0; i < n; i++){
            d[i] = func(x[i]);
            for(int j = 0; j < 50; j++){
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
        while(ans <= k && j < 50){
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
    static long[] func(long x){
        int index = 0;
        long n = x;
        long[] res = new long[50];
        Arrays.fill(res, 0);
        while(n > 0){
            res[index] = n % 2;
            index++;
            n /= 2;
        }
        return res;
    }
}