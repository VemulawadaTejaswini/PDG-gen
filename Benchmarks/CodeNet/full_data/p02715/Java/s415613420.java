import java.util.*;

public class Main {

    static int mod = 1_000_000_007;
    static long pow(long a,long n) {
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

    static List<Integer> divisor(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i=1;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                list.add(i);
                if (i*i!=n) {
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long ans = 0L;

        long[] val = new long[K+1];
        for (int i=1;i<=K;i++) {
            val[i] = pow(K/i, N);
        }
        for (int i=K;i>=1;i--) {
            ArrayList<Integer> list = new ArrayList<Integer>(divisor(i));
            for (Integer j : list) {
                if (j==i) continue;
                else val[j]-=val[i];
            }
        }
        for (int i=1;i<=K;i++) {
            ans = (ans+(long)i*val[i])%mod;
        }
        System.out.println(ans);
    }
}