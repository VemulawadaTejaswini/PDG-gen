import java.util.*;

public class Main{

    boolean[] sieve;
    private void sieveOfEratosthenes(int n){
        sieve = new boolean[n+1];
        Arrays.fill(sieve, true);

        sieve[0] = false;
        sieve[1] = false;
        int i=2;
        while(true){
            if(sieve[i]){
                for(int j=2;i*j<sieve.length;j++){
                    sieve[i*j] = false;
                }
            }
            i++;
            if(i>=n/2){
                break;
            }
        }
    }

    private boolean nIsPrime(int n){
        return sieve[n];
    }

    private boolean nIsLike2017(int n){
        float f = (n+1)/2;
        int n2 = (int)f;
        if(f != n2){
            return false;
        }
        return nIsPrime(n) && nIsPrime(n2);        
    }

    private int solve(int l, int r){
        int result = 0;
        for(int i=l;i<=r;i++){
            if(nIsLike2017(i)){
                result ++;
            }
        }
        return result;
    }

    private void _main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        int[] l = new int[q];
        int[] r = new int[q];

        for(int i=0;i<q;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        int max=0;
        for(int i=0;i<q;i++){
            max = Math.max(r[i], max);
        }
        sieveOfEratosthenes(max);

        for(int i=0;i<q;i++){
            System.out.println(solve(l[i], r[i]));
        }

        sc.close();
    }

    public static void main(String[] args){
            (new Main())._main(args);
    }
}
