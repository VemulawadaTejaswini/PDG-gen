import java.util.*;

public class Main {
    static int mod = 998244353;
    static long pow(long a,int n) {
        long res=1;
        while (n>0) {
            if ((n-n/2*2)==1) {
                res=res*a%mod;
            }
            a=a*a%mod;
            n>>=1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] D = new int[N];
        int[] map = new int[N+100];
        for (int i=0;i<N;i++) {
            D[i] = Integer.parseInt(sc.next());
            map[D[i]]++;
        }
        long ans = 1L;
        for (int i=1;i<N+100;i++) {
            if (map[i]==0) {
                break;
            } else {
                ans = ans*pow(map[i-1], map[i])%mod;
            }
        }
        if (D[0]!=0) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
    }
}