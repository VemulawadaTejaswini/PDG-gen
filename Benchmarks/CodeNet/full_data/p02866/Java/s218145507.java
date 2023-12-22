import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = 998244353;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> map = new ArrayList<Integer>();
        int first = sc.nextInt();
        if(first != 0){
            System.out.println(0);
            return;
        }
        for(int i = 1; i < n; i++){
            map.add(sc.nextInt());
        }
        Collections.sort(map);
        if(map.get(0) == 0){
            System.out.println(0);
            return;
        }
        long ans = 1;
        int prev = 0;
        long prevcnt = 0;
        long nowcnt = 0;
        for(int m : map){
            if(m == 1){
                prev = 1;
                prevcnt++;
            }else if(m != prev){
                if(m - prev == 1 && prev != 1){
                    ans *= rep2(prevcnt,nowcnt,mod);
                    ans %= mod;
                    prev = m;
                    prevcnt = nowcnt;
                    nowcnt = 1;
                }else if(m - prev == 1){
                    prev = m;
                    nowcnt++;
                }else{
                    System.out.println(0);
                    return;
                }
            }else{
                nowcnt++;
            }
        }
        System.out.println(ans * rep2(prevcnt,nowcnt,mod) % mod);
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