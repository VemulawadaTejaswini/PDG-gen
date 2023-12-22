import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long mod = (long)Math.pow(10,9)+7;
        int n = sc.nextInt();
        long nl = (long)n;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[sc.nextInt()]++;
        }
        if(n == 1 && a[0] == 1){
            System.out.println(1);
        }else if(n % 2 == 0){
            for(int i = 1; i < n; i+=2){
                if(a[i] != 2){
                    System.out.println(0);
                    return;
                }
            }
            System.out.println(rep2(2L,n/2L,mod));
        }else{
            for(int i = 0; i < n; i+=2){
                if((i == 0 && a[i] != 1) || (i != 0 && a[i] != 2)){
                    System.out.println(0);
                    return;
                }
            }
            System.out.println(rep2(2L,(n-1)/2L,mod));
        }
    }
    
    private static long rep2(long b, long n, long mod){
        if(n == 0) return 1;
        if(n == 1) return b;
        long bn = rep2(b,n/2,mod)%mod;
        if(n % 2 == 0){
            return (long)(bn%mod*bn%mod)%mod;
        }else{
            return (long)(bn%mod*bn%mod)%mod*b%mod;
        }
    }
}
