import java.util.*;

class Main{
    static long Mod = 1000000000+7;
    static int maxn = 200000;
    static long[] fac = new long[maxn+1];
    static long[] inv = new long[maxn+1];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if(isPrime(M)){
            System.out.println(M);
            System.exit(0);
        }
        ini();
        HashMap<Integer,Integer> dic = new HashMap<>();
        for(int i=2;M>=i;i++){
            int cnt = 0;
            if(M%i==0){
                while(M%i==0){
                    cnt++;
                    M = M/i;
                }
                dic.put(i,cnt);
                if(isPrime(M)){
                    dic.put(M,1);
                    break;
                }
            }
        }
        long ans = 1;
        for(Integer w:dic.keySet()){
            int cnt = dic.get(w);
            ans = ans*com(N-1+cnt,N-1)%Mod;
        }
        System.out.println(ans);
    }

    static void ini(){
        fac[0]=1;
        for(int i=1;i<=maxn;i++) fac[i]=fac[i-1]*i%Mod;
        inv[0]=1;
        inv[maxn] = pow(fac[maxn],Mod-2);
        for(int i=maxn-1;i>=1;i--) inv[i]=inv[i+1]*(i+1)%Mod;
    }
    static long com(int m, int n){
        return fac[m]*inv[n]%Mod*inv[m-n]%Mod;
    }
    static long pow(long base, long p){
        long ans = 1;
        while(p>0){
            if(p%2==1) ans = ans*base%Mod;
            base = base*base%Mod;
            p /= 2;
        }
        return ans;
    }
    static boolean isPrime(int n){
        if(n==1) return false;
        int up = (int) Math.sqrt(n)+1;
        for(int i=2;i<=up;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
