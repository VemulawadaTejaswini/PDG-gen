import java.util.*;

public class Main {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int k = sc.nextInt();

        long mod = (long) 1e9 + 7;

        Combination com1 = new Combination(n - k + 1, mod);
        Combination com2 = new Combination(k - 1, mod);

        for (int i = 1; i <= k; i++) {
            long num1 = com1.combine(n - k + 1, i)%mod;
            long num2 = com2.combine(k-1, i-1)%mod;

            System.out.println(num1*num2%mod);
        }
    }
}


class Combination{

    long factrical[];
    long inverse[];
    long MOD;

    Combination(int size, long mod) {
        this.factrical = new long[size+1];
        this.inverse = new long[size+1];
        this.MOD = mod;

        this.factrical[0] = 1;
        this.inverse[0] = 1;

        for (int i=1; i<=size; i++){
            factrical[i] = (factrical[i-1]*i)%MOD;
            inverse[i] = power(factrical[i], (int)MOD-2)%MOD;
        }
    }

    long combine(int n, int k){
        return factrical[n] * (inverse[k]%MOD) * (inverse[n-k]%MOD);
    }

    long power(long x, int n){
        long ans = 1;
        while(n>0){
            if ((n&1)==1){
                ans = ans*x%MOD;
            }
            x = x*x%MOD;
            n >>= 1;
        }
        return ans;
    }


}


