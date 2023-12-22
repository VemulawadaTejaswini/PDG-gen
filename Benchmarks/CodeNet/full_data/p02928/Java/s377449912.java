import java.util.*;

class Main{
    static long MOD = 1_000_000_000 + 7;
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long k = stdIn.nextLong();
        int a[] = new int [n*2];
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
            a[i+n] = a[i];
        }
        long ans = 0;

        long b[] = new long [n];
        long c[] = new long [n];
        for(int i = 0;  i < n; i++){
            for(int j = i+1; j < n + i; j++){
                if(a[i] > a[j]){
                    b[i]++; 
                    if(j >= n){
                        c[i]++;
                    }
                } 
            }
        }

        
        for(int i = 0; i < n; i++){
            ans += (b[i]*((((k+1)*k)/2)%MOD- c[i]*k))%MOD;
            ans = ans % MOD;
        }
        System.out.println(ans);
    }