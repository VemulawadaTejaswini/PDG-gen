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
        int[][] d = new int[n][45];
        int[] cnt0 = new int[45], cnt1 = new int[45];
        for(int i = 0; i < n; i++){
            d[i] = func(x[i]);
            for(int j = 0; j < 45; j++){
                if(d[i][j] == 0){
                    cnt0[j]++;
                }
                else if(d[i][j] == 1){
                    cnt1[j]++;
                }
            }
        }
        long ans = 0;
        int j = 44;
        long tmp = 0;
        while(j >= 0){
            if(cnt0[j] > cnt1[j]){
                tmp = ans + (long) Math.pow(2, j);
            }
            if(tmp <= k) ans = tmp;
            j--;
        }
        long aans = 0;
        for(int i = 0; i < n; i++){
            aans += x[i] ^ ans;
        }
        System.out.println(aans);

/*        long max = 0; int maxindex = -1;
        for(int z = 1; z <= k; z++){
            long ttmp = 0;
            for(int i = 0; i < n; i++){
                ttmp += x[i] ^ z;
            }
            if(ttmp > max){
                max = ttmp;
                maxindex = z;
            }
        }
        System.out.println(maxindex + " " + max);*/
    }
    static int[] func(long x){
        int index = 0;
        long n = x;
        int[] res = new int[45];
        while(n > 0){
            res[index] = (int) (n % 2);
            index++;
            n /= 2;
        }
        return res;
    }
}