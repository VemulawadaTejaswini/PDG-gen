import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M+2];
        a[0] = 0; a[M+1] = N;
        for(int i = 1; i < M+1; i++){
            a[i] = sc.nextInt();
        }
        long mod = 1000000007;
        long count = 1;
        for(int i = 0; i < M+1; i++){
            if((i != 0 && i != M) && (a[i+1] - a[i] == 1)) {
                count = 0;
                continue;
            }
            if(i == 0 || i == M)
                count *= (stairs(a[i+1] - a[i] - 1) % mod);
            else
                count *= (stairs(a[i+1] - a[i] - 2) % mod);
        }
        System.out.println(count%mod);
        sc.close();
    }

    static long stairs(long n){
        if(n == 0)
            return 1;
        if(n == 1)
            return 1;
        return (stairs(n-1) + stairs(n-2));
    }
}
