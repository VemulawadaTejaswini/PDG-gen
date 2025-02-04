import java.util.*;

public class Main {

    // global
    static long fact[];
    static long inverse[];
    static int mod = 1_000_000_007;

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

    static long modinv(long n) {
        return pow(n, mod-2);
    }

    static long comb(int n,int k){
        if(n<0 || k<0 || n<k)return 0;
        return fact[n]*(inverse[k]*inverse[n-k]%mod) %mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nn = n;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n_a = n-a;
        int n_b = n-b;

        long[] pre = new long[] { 1, 682498929, 491101308, 76479948, 723816384, 67347853, 27368307, 625544428,
                199888908, 888050723, 927880474, 281863274, 661224977, 623534362, 970055531, 261384175, 195888993,
                66404266, 547665832, 109838563, 933245637, 724691727, 368925948, 268838846, 136026497, 112390913,
                135498044, 217544623, 419363534, 500780548, 668123525, 128487469, 30977140, 522049725, 309058615,
                386027524, 189239124, 148528617, 940567523, 917084264, 429277690, 996164327, 358655417, 568392357,
                780072518, 462639908, 275105629, 909210595, 99199382, 703397904, 733333339, 97830135, 608823837,
                256141983, 141827977, 696628828, 637939935, 811575797, 848924691, 131772368, 724464507, 272814771,
                326159309, 456152084, 903466878, 92255682, 769795511, 373745190, 606241871, 825871994, 957939114,
                435887178, 852304035, 663307737, 375297772, 217598709, 624148346, 671734977, 624500515, 748510389,
                203191898, 423951674, 629786193, 672850561, 814362881, 823845496, 116667533, 256473217, 627655552,
                245795606, 586445753, 172114298, 193781724, 778983779, 83868974, 315103615, 965785236, 492741665,
                377329025, 847549272, 698611116 };

        int q = (int) (n / (1e7));
        long n_ = pre[q];
        n %= (1e7);
        for (long i = (long) ((1e7) * q + 1); i <= 1e7 * q + n; ++i) {
            n_ = (n_ * i) % mod;
        }

        int r = (int) (a / (1e7));
        long a_ = pre[r];
        a %= (1e7);
        for (long i = (long) ((1e7) * r + 1); i <= 1e7 * r + a; ++i) {
            a_ = (a_ * i) % mod;
        }

        int s = (int) (b / (1e7));
        long b_ = pre[s];
        b %= (1e7);
        for (long i = (long) ((1e7) * s + 1); i <= 1e7 * s + b; ++i) {
            b_ = (b_ * i) % mod;
        }

        int tt = (int) (n_a / (1e7));
        long n_a_ = pre[tt];
        n_a %= (1e7);
        for (long i = (long) ((1e7) * tt + 1); i <= 1e7 * tt + n_a; ++i) {
            n_a_ = (n_a_ * i) % mod;
        }

        int uu = (int) (n_b / (1e7));
        long n_b_ = pre[uu];
        n_b %= (1e7);
        for (long i = (long) ((1e7) * uu + 1); i <= 1e7 * uu + n_b; ++i) {
            n_b_ = (n_b_ * i) % mod;
        }

        // System.out.println(n_);
        // System.out.println(a_);
        // System.out.println(b_);
        // System.out.println(n_a_);
        // System.out.println(n_b_);
        long ans = (pow(2, nn)-n_*modinv(n_a_)%mod*modinv(a_)%mod+mod)%mod-n_*modinv(n_b_)%mod*modinv(b_)%mod-1+mod;
        ans%=mod;
        System.out.println(ans);
    }
}